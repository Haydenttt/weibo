package com.unicom.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.unicom.exception.EmWeiboError;
import com.unicom.exception.WeiboException;
import com.unicom.mapper.*;
import com.unicom.model.*;
import com.unicom.service.ProfileService;
import com.unicom.util.CommonUtil;
import com.unicom.util.DateUtil;
import com.unicom.util.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.List;

/**
 * @program: weibo
 * @description:
 * @author: liupei
 * @create: 2019-07-22 08:53
 **/
@Service
public class ProfileServiceImpl implements ProfileService {

    static final String PROFILE_URL = "http://ef.zhiweidata.com/analy/overviewV2.do";
    static final String IMG_URL = "http://ef.zhiweidata.com/img/event.do?name=";

    @Autowired
    private EventInfoMapper eventInfoMapper;
    @Autowired
    private EventHistoryTopMapper eventHistoryTopMapper;
    @Autowired
    private EventStatsMapper eventStatsMapper;
    @Autowired
    private EventRelaventCaseMapper eventRelaventCaseMapper;
    @Autowired
    private EventHeatRatioMapper eventHeatRatioMapper;

    @Override
    public String crawlProfileData(String eventId) {
        String data = HttpUtil.sendPost(PROFILE_URL, "eventId=" + eventId);
        return data;
    }

    @Override
    public void handlProfileData(String dataStr, String eventId) {
        EventInfo eventInfo = new EventInfo();
        EventStats eventStats = new EventStats();
        try {
            //事件概况-事件信息
            //把事件概况数据data转换为json格式
            JSONObject dataJson = JSONObject.parseObject(dataStr);
            //获取json中嵌套的key为data的json
            JSONObject data = dataJson.getJSONObject("data");
            //new EventInfo对象填充数据
            eventInfo.setEventId(eventId);
            eventInfo.setTitle(data.getString("name"));
            eventInfo.setDescription(data.getString("descript"));
            eventInfo.setFirstType(data.getString("firstType"));
            eventInfo.setStartTime(CommonUtil.milliSecondToDate(Long.valueOf(data.getString("startTime"))));
            eventInfo.setTags(data.getJSONArray("tags").toString());
            //事件是否已结束。0-未结束，1-已结束
            eventInfo.setIsEnd(data.getString("isEnd").equals("true") ? (byte) 1 : (byte) 0);
            eventInfo.setCreator("lp");
            eventInfo.setUpdater("lp");

            //事件每日、每小时热度
            JSONArray handledHourJsonArray = handleHourHeatRatio(data);
            JSONArray handledDayJsonArray = handleDayHeatRatio(data);

            //向数据库中添加事件时间热度数据前先清空旧数据
            EventHeatRatioExample eventHourHeatRatioExample = new EventHeatRatioExample();
            EventHeatRatioExample.Criteria hourHeatCriteria = eventHourHeatRatioExample.createCriteria();
            hourHeatCriteria.andEventIdEqualTo(eventId);
            hourHeatCriteria.andHeatTypeEqualTo((byte) 1);
            eventHeatRatioMapper.deleteByExample(eventHourHeatRatioExample);
            for (int i = handledHourJsonArray.size() - 1; i >= 0; i--) {
                JSONObject hourHeatRatio = (JSONObject) handledHourJsonArray.get(i);
                EventHeatRatio eventHeatRatio = new EventHeatRatio();
                eventHeatRatio.setEventId(eventId);
                eventHeatRatio.setHeatType((byte) 1); //1-小时热度
                eventHeatRatio.setTimePoint(hourHeatRatio.getString("timePoint"));
                eventHeatRatio.setHeatValue(hourHeatRatio.getBigDecimal("hE"));
                eventHeatRatio.setPoint(hourHeatRatio.getInteger("point") + 1);
                eventHeatRatio.setPro(hourHeatRatio.getBigDecimal("pro"));
                eventHeatRatio.setCreator("lp");
                eventHeatRatio.setUpdater("lp");
                eventHeatRatioMapper.insertSelective(eventHeatRatio);
            }

            //向数据库中添加事件每天热度数据前先清空旧数据
            EventHeatRatioExample eventDayHeatRatioExample = new EventHeatRatioExample();
            EventHeatRatioExample.Criteria dayHeatCriteria = eventDayHeatRatioExample.createCriteria();
            dayHeatCriteria.andEventIdEqualTo(eventId);
            dayHeatCriteria.andHeatTypeEqualTo((byte) 0);
            eventHeatRatioMapper.deleteByExample(eventDayHeatRatioExample);
            for (int i = handledDayJsonArray.size() - 1; i >= 0; i--) {
                JSONObject dayHeatRatio = (JSONObject) handledDayJsonArray.get(i);
                EventHeatRatio eventHeatRatio = new EventHeatRatio();
                eventHeatRatio.setEventId(eventId);
                eventHeatRatio.setHeatType((byte) 0); //0-每天热度
                eventHeatRatio.setTimePoint(dayHeatRatio.getString("timePoint"));
                eventHeatRatio.setHeatValue(dayHeatRatio.getBigDecimal("hE"));
                eventHeatRatio.setPoint(dayHeatRatio.getInteger("point") + 1);
                eventHeatRatio.setPro(dayHeatRatio.getBigDecimal("pro"));
                eventHeatRatio.setCreator("lp");
                eventHeatRatio.setUpdater("lp");
                eventHeatRatioMapper.insertSelective(eventHeatRatio);
            }

            //事件概况-影响力、媒体参与情况
            eventStats.setEventId(eventId);
            JSONObject infJson = data.getJSONObject("inf");
            JSONObject effect = infJson.getJSONObject("effect");
            eventStats.setEffectInf(effect.getBigDecimal("inf"));
            eventStats.setEffectTypePro(effect.getBigDecimal("typePro"));
            eventStats.setEffectAllPro(effect.getBigDecimal("allPro"));
            eventStats.setEffectClassAvg(effect.getBigDecimal("classAvg"));
            JSONObject weibo = infJson.getJSONObject("weibo");
            eventStats.setWeiboInf(weibo.getBigDecimal("inf"));
            eventStats.setWeiboTypePro(weibo.getBigDecimal("typePro"));
            eventStats.setWeiboAllPro(weibo.getBigDecimal("allPro"));
            eventStats.setWeiboClassAvg(weibo.getBigDecimal("classAvg"));
            JSONObject wechat = infJson.getJSONObject("wechat");
            eventStats.setWeixinInf(wechat.getBigDecimal("inf"));
            eventStats.setWeixinTypePro(wechat.getBigDecimal("typePro"));
            eventStats.setWeixinAllPro(wechat.getBigDecimal("allPro"));
            eventStats.setWeixinClassAvg(wechat.getBigDecimal("classAvg"));
            JSONObject media = infJson.getJSONObject("media");
            eventStats.setMediaInf(media.getBigDecimal("inf"));
            eventStats.setMediaTypePro(media.getBigDecimal("typePro"));
            eventStats.setMediaAllPro(media.getBigDecimal("allPro"));
            eventStats.setMediaClassAvg(media.getBigDecimal("classAvg"));

            JSONObject mediaIn = data.getJSONObject("meidaInV2");
            JSONObject ccpMedia = mediaIn.getJSONObject("yangji");
            JSONObject financeMedia = mediaIn.getJSONObject("caijing");
            JSONObject techMedia = mediaIn.getJSONObject("keji");
            eventStats.setMediaNum(mediaIn.getInteger("import"));
            eventStats.setCcpMediaIn(ccpMedia.getBigDecimal("mediaIn"));
            eventStats.setCcpTypePro(ccpMedia.getBigDecimal("typePro"));
            eventStats.setCcpAllPro(ccpMedia.getBigDecimal("allPro"));
            eventStats.setCcpClassAvg(ccpMedia.getBigDecimal("classAvg"));
            eventStats.setFinanceMediaIn(financeMedia.getBigDecimal("mediaIn"));
            eventStats.setFinanceTypePro(financeMedia.getBigDecimal("typePro"));
            eventStats.setFinanceAllPro(financeMedia.getBigDecimal("allPro"));
            eventStats.setFinanceClassAvg(financeMedia.getBigDecimal("classAvg"));
            eventStats.setTechMediaIn(techMedia.getBigDecimal("mediaIn"));
            eventStats.setTechTypePro(techMedia.getBigDecimal("typePro"));
            eventStats.setTechAllPro(techMedia.getBigDecimal("allPro"));
            eventStats.setTechClassAvg(techMedia.getBigDecimal("classAvg"));
            eventStats.setCreator("lp");
            eventStats.setUpdater("lp");
            EventStatsExample eventStatsExample = new EventStatsExample();
            EventStatsExample.Criteria criteria = eventStatsExample.createCriteria();
            criteria.andEventIdEqualTo(eventStats.getEventId());
            List<EventStats> eventStatsList = eventStatsMapper.selectByExample(eventStatsExample);
            if (eventStatsList.size() == 0) {
                eventStatsMapper.insertSelective(eventStats);
            }

            //事件概况-历史成就
            //new EventHistoryTop对象填充数据并插入数据库，若topName字段重复则不插入
            JSONArray historyTopArray = data.getJSONArray("historyTop");
            for (Object historyTop : historyTopArray) {
                EventHistoryTop eventHistoryTop = new EventHistoryTop();
                eventHistoryTop.setEventId(eventId);
                eventHistoryTop.setTopName(((JSONObject) historyTop).getString("topName"));
                eventHistoryTop.setRank(((JSONObject) historyTop).getInteger("rank"));
                eventHistoryTop.setCreator("lp");
                eventHistoryTop.setUpdater("lp");
                EventHistoryTopExample eventHistoryTopExample = new EventHistoryTopExample();
                EventHistoryTopExample.Criteria eventHistoryTopExampleCriteria = eventHistoryTopExample.createCriteria();
                eventHistoryTopExampleCriteria.andTopNameEqualTo(eventHistoryTop.getTopName());
                List<EventHistoryTop> eventHistoryTopList = eventHistoryTopMapper.selectByExample(eventHistoryTopExample);
                if (eventHistoryTopList.size() == 0) {
                    eventHistoryTopMapper.insertSelective(eventHistoryTop);
                }
            }

            //事件概况-同类、相关事件
            JSONArray classEvents = data.getJSONArray("classEvents");
            JSONArray aboutEvents = data.getJSONArray("aboutEvents");
            for (Object classEvent : classEvents) {
                EventRelaventCase eventRelaventCase = new EventRelaventCase();
                eventRelaventCase.setEventId("eventId");
                eventRelaventCase.setRelaventType((byte) 0);//0-同类事件
                eventRelaventCase.setRelaventEventId(((JSONObject) classEvent).getString("id"));
                eventRelaventCase.setPoint(((JSONObject) classEvent).getInteger("point"));
                eventRelaventCase.setTitle(((JSONObject) classEvent).getString("name"));
                eventRelaventCase.setInfoExponent(((JSONObject) classEvent).getBigDecimal("infExponent"));
                eventRelaventCase.setImgUrl(IMG_URL + ((JSONObject) classEvent).getString("eventImgUrl"));
                eventRelaventCase.setCreator("lp");
                eventRelaventCase.setUpdater("lp");
                EventRelaventCaseExample eventRelaventCaseExample = new EventRelaventCaseExample();
                EventRelaventCaseExample.Criteria eventRelaventCaseExampleCriteria = eventRelaventCaseExample.createCriteria();
                eventRelaventCaseExampleCriteria.andRelaventEventIdEqualTo(eventRelaventCase.getRelaventEventId());
                List<EventRelaventCase> eventRelaventCaseList = eventRelaventCaseMapper.selectByExample(eventRelaventCaseExample);
                if (eventRelaventCaseList.size() == 0) {
                    eventRelaventCaseMapper.insertSelective(eventRelaventCase);
                }
            }

            for (Object aboutEvent : aboutEvents) {
                EventRelaventCase eventRelaventCase = new EventRelaventCase();
                eventRelaventCase.setEventId("eventId");
                eventRelaventCase.setRelaventType((byte) 1);//1-相关事件
                eventRelaventCase.setRelaventEventId(((JSONObject) aboutEvent).getString("id"));
                eventRelaventCase.setTitle(((JSONObject) aboutEvent).getString("name"));
                eventRelaventCase.setInfoExponent(((JSONObject) aboutEvent).getBigDecimal("infExponent"));
                eventRelaventCase.setImgUrl(IMG_URL + ((JSONObject) aboutEvent).getString("eventImgUrl"));
                eventRelaventCase.setCreator("lp");
                eventRelaventCase.setUpdater("lp");
                EventRelaventCaseExample eventRelaventCaseExample = new EventRelaventCaseExample();
                EventRelaventCaseExample.Criteria eventRelaventCaseExampleCriteria = eventRelaventCaseExample.createCriteria();
                eventRelaventCaseExampleCriteria.andRelaventEventIdEqualTo(eventRelaventCase.getRelaventEventId());
                List<EventRelaventCase> eventRelaventCaseList = eventRelaventCaseMapper.selectByExample(eventRelaventCaseExample);
                if (eventRelaventCaseList.size() == 0) {
                    eventRelaventCaseMapper.insertSelective(eventRelaventCase);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
//            throw new WeiboException(EmWeiboError.UNKNOW_ERROR.setErrMsg("解析事件概况json失败"));
        }
        //查询数据库中是否已有该事件数据，如果没有则插入，否则不做操作
        EventInfoExample eventInfoExample = new EventInfoExample();
        EventInfoExample.Criteria criteria = eventInfoExample.createCriteria();
        criteria.andEventIdEqualTo(eventId);
        List<EventInfo> eventInfoList = eventInfoMapper.selectByExample(eventInfoExample);
        if (eventInfoList.size() == 0) {
            eventInfoMapper.insertSelective(eventInfo);
        }
    }

    public EventInfo getEventInfoData(String eventId) {
        EventInfoExample eventInfoExample = new EventInfoExample();
        EventInfoExample.Criteria criteria = eventInfoExample.createCriteria();
        criteria.andEventIdEqualTo(eventId);
        List<EventInfo> eventInfoList = eventInfoMapper.selectByExample(eventInfoExample);
        return eventInfoList.get(0);
    }

    @Override
    public JSONArray handleHourHeatRatio(JSONObject jsonObject) {
        JSONArray hourHeat = jsonObject.getJSONArray("hourHeatRatio");
        JSONArray resultArray = new JSONArray();
        boolean isEnd = jsonObject.getString("isEnd").equals("true");
        if (isEnd) {
            //对于已结束事件获取事件全期热度峰值的时间，并取该时间点前12小时及后11小时共24小时的数据
            BigDecimal bigDecimal = new BigDecimal(0);
            int index = 0;
            for (int i = 0; i < hourHeat.size(); i++) {
                BigDecimal bigDecimalTmp = ((JSONObject) (hourHeat.get(i))).getBigDecimal("hE");
                if (bigDecimalTmp.compareTo(bigDecimal) > 0) {
                    bigDecimal = bigDecimalTmp;
                    index = i;
                }
            }
            resultArray = JSONArray.parseArray(JSON.toJSONString(hourHeat.subList(index - 12, index + 13)));//截取7天的子list
        } else {
            //对于未结束事件取当前小时加过去24小时共25小时的数据，hourHeatRatio中当前一小时的数据基本为空，所以从hourNowRankMap中取出对应的pro值和point值。
            JSONObject hourHeatNaught = (JSONObject) hourHeat.get(0);
            String startTimePoint = hourHeatNaught.getString("timePoint");
            //获取未结束事件小时热度list的长度，某些事件元素不足25个，需要补全前面为空的元素
            int hourHeatSize = hourHeat.size();
            int sizeDValue = 25 - hourHeatSize;//计算需要补全的空元素个数
            if (sizeDValue > 0) {
                String[] calculatedPastHourArray;
                try {
                    calculatedPastHourArray = DateUtil.getCalculateDay(startTimePoint, -sizeDValue, DateUtil.HOUR_PATTERN, DateUtil.ONE_HOUR_TIME);
                } catch (ParseException e) {
                    throw new WeiboException(EmWeiboError.UNKNOW_ERROR.setErrMsg("profileService解析时间格式失败"));
                }
                for (int i = 0; i < sizeDValue; i++) {
                    JSONObject newHourHeat = new JSONObject();
                    newHourHeat.put("pro", 0);
                    newHourHeat.put("point", 0);
                    newHourHeat.put("hE", 0);
                    newHourHeat.put("timePoint", calculatedPastHourArray[sizeDValue - 1 - i]);
                    resultArray.add(newHourHeat);
                }
            }
            int bound = hourHeat.size() - 25 >= 0 ? 25 : hourHeatSize;
            for (int i = 0; i < bound; i++) {
                if (i == hourHeatSize - 1) {
                    ((JSONObject) hourHeat.get(i)).put("pro", jsonObject.getJSONObject("hourNowRankMap").getBigDecimal("pro"));
                    ((JSONObject) hourHeat.get(i)).put("point", jsonObject.getJSONObject("hourNowRankMap").getInteger("point") + 1);
                    ((JSONObject) hourHeat.get(i)).put("hE", jsonObject.getJSONObject("hourNowRankMap").getBigDecimal("hE"));
                }
                resultArray.add(hourHeat.get(i));
            }
        }
        return resultArray;
    }

    @Override
    public JSONArray handleDayHeatRatio(JSONObject jsonObject) {
        JSONArray dayHeat = jsonObject.getJSONArray("dayHeatRatio");
        JSONArray resultArray = new JSONArray();
        boolean isEnd = jsonObject.getString("isEnd").equals("true");
        if (isEnd) {
            //对于已结束事件取舆论场占比峰值当天及前后各三天共七天的数据
            int maxIndex = 0;//峰值当天对应的下标
            String maxRankTimePoint = jsonObject.getJSONObject("dayMaxRankMap").getString("timePoint");
            for (int i = 0; i < dayHeat.size(); i++) {
                String timePointTmp = ((JSONObject) dayHeat.get(i)).getString("timePoint");
                if (maxRankTimePoint.equals(timePointTmp)) {
                    maxIndex = i;
                    break;
                }
            }
            resultArray = JSONArray.parseArray(JSON.toJSONString(dayHeat.subList(maxIndex - 3, maxIndex + 4)));//截取7天的子list
        } else {
            //对于未结束事件取当前日期前7天的数据
            JSONObject dayHeatNaught = (JSONObject) dayHeat.get(0);
            String startTimePoint = dayHeatNaught.getString("timePoint");
            //获取未结束事件每天热度list的长度，某些事件元素不足7个，需要补全前面为空的元素
            int dayHeatSize = dayHeat.size();
            int sizeDValue = 7 - dayHeatSize;//计算需要补全的空元素个数
            if (sizeDValue > 0) {
                String[] calculatedPastDayrArray;
                try {
                    calculatedPastDayrArray = DateUtil.getCalculateDay(startTimePoint, -sizeDValue, DateUtil.DATE_PATTERN, DateUtil.ONE_DAY_TIME);
                } catch (ParseException e) {
                    throw new WeiboException(EmWeiboError.UNKNOW_ERROR.setErrMsg("profileService解析时间格式失败"));
                }
                for (int i = 0; i < sizeDValue; i++) {
                    JSONObject newDayHeat = new JSONObject();
                    newDayHeat.put("pro", 0);
                    newDayHeat.put("point", 0);
                    newDayHeat.put("hE", 0);
                    newDayHeat.put("timePoint", calculatedPastDayrArray[sizeDValue - 1 - i]);
                    resultArray.add(newDayHeat);
                }
            }
            int bound = dayHeat.size() - 7 >= 0 ? 7 : dayHeatSize;
            for (int i = 0; i < bound; i++) {
                resultArray.add(dayHeat.get(i));
            }
        }
        System.out.println(resultArray);
        return resultArray;
    }

    public static void main(String[] args) {
        ProfileService profileService = new ProfileServiceImpl();
        String data = profileService.crawlProfileData("423086a017b3196b10016313");
        profileService.handlProfileData(data, "423086a017b3196b10016313");
//        profileService.handleDayHeatRatio(JSONObject.parseObject(data).getJSONObject("data"));
    }
}
