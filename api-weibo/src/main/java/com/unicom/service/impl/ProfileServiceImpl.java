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
import java.util.*;

/**
 * @program: weibo
 * @description:
 * @author: lp
 * @create: 2019-07-22 08:53
 **/
@Service
public class ProfileServiceImpl implements ProfileService {

    private static final String PROFILE_URL = "http://ef.zhiweidata.com/analy/overviewV2.do";
    private static final String IMG_SRC_URL = "http://ef.zhiweidata.com/analy/eventAnaly.do";
    private static final String IMG_URL = "http://ef.zhiweidata.com/img/event.do?name=";

    private final EventInfoMapper eventInfoMapper;
    private final EventHistoryTopMapper eventHistoryTopMapper;
    private final EventStatsMapper eventStatsMapper;
    private final EventRelaventCaseMapper eventRelaventCaseMapper;
    private final EventHeatRatioMapper eventHeatRatioMapper;

    @Autowired
    public ProfileServiceImpl(EventInfoMapper eventInfoMapper, EventHistoryTopMapper eventHistoryTopMapper, EventStatsMapper eventStatsMapper, EventRelaventCaseMapper eventRelaventCaseMapper, EventHeatRatioMapper eventHeatRatioMapper) {
        this.eventInfoMapper = eventInfoMapper;
        this.eventHistoryTopMapper = eventHistoryTopMapper;
        this.eventStatsMapper = eventStatsMapper;
        this.eventRelaventCaseMapper = eventRelaventCaseMapper;
        this.eventHeatRatioMapper = eventHeatRatioMapper;
    }

    @Override
    public String crawlProfileData(String eventId) {
        return HttpUtil.sendPost(PROFILE_URL, "eventId=" + eventId);
    }

    private String crawlImgUrl(String eventId) {
        JSONObject data = JSONObject.parseObject(HttpUtil.sendPost(IMG_SRC_URL, "eventId=" + eventId));
        return data.getString("imgUrl");
    }

    @Override
    public void handleProfileData(String dataStr, String eventId) {
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
            System.out.println(data);
            eventInfo.setTitle(data.getString("name"));
            eventInfo.setDescription(data.getString("descript"));
            eventInfo.setFirstType(data.getString("firstType"));
            eventInfo.setStartTime(CommonUtil.milliSecondToDate(Long.valueOf(data.getString("startTime"))));
            eventInfo.setTags(data.getJSONArray("tags").toString());
            //事件是否已结束。0-未结束，1-已结束
            eventInfo.setIsEnd(data.getString("isEnd").equals("true") ? (byte) 1 : (byte) 0);
            eventInfo.setImgUrl(IMG_URL + crawlImgUrl(eventId));
            eventInfo.setCreator("lp");
            eventInfo.setUpdater("lp");

            //事件每日、每小时热度
            JSONArray handledHourJsonArray = handleHourHeatRatio(data);
            JSONArray handledDayJsonArray = handleDayHeatRatio(data);

            //向数据库中添加事件时间热度数据前先清空旧数据
            EventHeatRatioExample eventHourHeatRatioExample = new EventHeatRatioExample();
            eventHourHeatRatioExample.createCriteria().andEventIdEqualTo(eventId);
            eventHeatRatioMapper.deleteByExample(eventHourHeatRatioExample);
            for (int i = handledHourJsonArray.size() - 1; i >= 0; i--) {
                JSONObject heatObj = (JSONObject) handledHourJsonArray.get(i);
                storeHeatRatio(eventId, heatObj, (byte) 1);
            }

            //向数据库中添加事件每天热度数据前先清空旧数据
            EventHeatRatioExample eventDayHeatRatioExample = new EventHeatRatioExample();
            EventHeatRatioExample.Criteria dayHeatCriteria = eventDayHeatRatioExample.createCriteria();
            dayHeatCriteria.andEventIdEqualTo(eventId);
            dayHeatCriteria.andHeatTypeEqualTo((byte) 0);
            eventHeatRatioMapper.deleteByExample(eventDayHeatRatioExample);
            for (int i = handledDayJsonArray.size() - 1; i >= 0; i--) {
                JSONObject heatObj = (JSONObject) handledDayJsonArray.get(i);
                storeHeatRatio(eventId, heatObj, (byte) 0);
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
                eventRelaventCase.setEventId(eventId);
                eventRelaventCase.setRelaventType((byte) 0);//0-同类事件
                eventRelaventCase.setRelaventEventId(((JSONObject) classEvent).getString("id"));
                eventRelaventCase.setPoint(((JSONObject) classEvent).getInteger("point"));
                storeRelaventEvent((JSONObject) classEvent, eventRelaventCase);
            }

            for (Object aboutEvent : aboutEvents) {
                EventRelaventCase eventRelaventCase = new EventRelaventCase();
                eventRelaventCase.setEventId(eventId);
                eventRelaventCase.setRelaventType((byte) 1);//1-相关事件
                eventRelaventCase.setRelaventEventId(((JSONObject) aboutEvent).getString("id"));
                storeRelaventEvent((JSONObject) aboutEvent, eventRelaventCase);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new WeiboException(EmWeiboError.UNKNOW_ERROR.setErrMsg("解析事件概况json失败"));
        }
        //查询数据库中是否已有该事件数据，如果没有则插入，否则不做操作
        EventInfoExample eventInfoExample = new EventInfoExample();
        EventInfoExample.Criteria criteria = eventInfoExample.createCriteria();
        criteria.andEventIdEqualTo(eventId);
        List<EventInfo> eventInfoList = eventInfoMapper.selectByExample(eventInfoExample);
        if (eventInfoList.size() == 0) {
            eventInfoMapper.insertSelective(eventInfo);
        } else {
            eventInfoMapper.updateByExampleSelective(eventInfo, eventInfoExample);
        }
    }

    private void storeHeatRatio(String eventId, JSONObject heatObj, byte heatType) {
        EventHeatRatio eventHeatRatio = new EventHeatRatio();
        eventHeatRatio.setEventId(eventId);
        eventHeatRatio.setHeatType(heatType); //1-小时热度
        eventHeatRatio.setTimePoint(heatObj.getString("timePoint"));
        eventHeatRatio.setHeatValue(heatObj.getBigDecimal("hE"));
        eventHeatRatio.setPoint(heatObj.getInteger("point"));
        eventHeatRatio.setPro(heatObj.getBigDecimal("pro"));
        eventHeatRatio.setCreator("lp");
        eventHeatRatio.setUpdater("lp");
        eventHeatRatioMapper.insertSelective(eventHeatRatio);
    }

    /**
     * 插入同类、相关事件数据
     *
     * @param relaventEvent     同类、相关事件json对象
     * @param eventRelaventCase 要插入的事件对象
     */
    private void storeRelaventEvent(JSONObject relaventEvent, EventRelaventCase eventRelaventCase) {
        eventRelaventCase.setTitle(relaventEvent.getString("name"));
        eventRelaventCase.setInfoExponent(relaventEvent.getBigDecimal("infExponent"));
        eventRelaventCase.setImgUrl(IMG_URL + relaventEvent.getString("eventImgUrl"));
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

    @Override
    public Map<String, Object> getEventInfoData(String eventId) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        EventInfoExample eventInfoExample = new EventInfoExample();
        EventInfoExample.Criteria criteria = eventInfoExample.createCriteria();
        criteria.andEventIdEqualTo(eventId);
        List<EventInfo> eventInfoList = eventInfoMapper.selectByExample(eventInfoExample);
        if (eventInfoList.size() > 0) {
            EventInfo eventInfo = eventInfoList.get(0);
            resultMap.put("eventId", eventInfo.getEventId());
            resultMap.put("title", eventInfo.getTitle());
            resultMap.put("description", eventInfo.getDescription());
            resultMap.put("firstType", eventInfo.getFirstType());
            resultMap.put("startTime", eventInfo.getStartTime());
            String tags = eventInfo.getTags();
            tags = tags.substring(1, tags.length() - 1);
            tags = tags.replaceAll("\"", "");
            List<String> tagList = Arrays.asList(tags.split(","));
            resultMap.put("tags", tagList);
            resultMap.put("imgUrl", eventInfo.getImgUrl());
            resultMap.put("isEnd", eventInfo.getIsEnd() == 0 ? "未结束" : "已结束");
        } else {
            resultMap.put("errMsg", "事件不存在！");
        }
        return resultMap;
    }

    @Override
    public Map<String, Object> getStats(String eventId) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        EventStatsExample eventStatsExample = new EventStatsExample();
        eventStatsExample.createCriteria().andEventIdEqualTo(eventId);
        List<EventStats> eventStatsList = eventStatsMapper.selectByExample(eventStatsExample);
        if (eventStatsList.size() > 0) {
            EventStats eventStats = eventStatsList.get(0);
            resultMap.put("effectInf", eventStats.getEffectInf());
            resultMap.put("effectTypePro", eventStats.getEffectTypePro());
            resultMap.put("effectAllPro", eventStats.getEffectAllPro());
            resultMap.put("effectClassAvg", eventStats.getEffectClassAvg());
            resultMap.put("weiboInf", eventStats.getWeiboInf());
            resultMap.put("weiboTypePro", eventStats.getWeiboTypePro());
            resultMap.put("weiboAllPro", eventStats.getWeiboAllPro());
            resultMap.put("weiboClassAvg", eventStats.getWeiboClassAvg());
            resultMap.put("weixinInf", eventStats.getWeixinInf());
            resultMap.put("weixinTypePro", eventStats.getWeixinTypePro());
            resultMap.put("weixinAllPro", eventStats.getWeixinAllPro());
            resultMap.put("weixinClassAvg", eventStats.getWeixinClassAvg());
            resultMap.put("mediaInf", eventStats.getMediaInf());
            resultMap.put("mediaTypePro", eventStats.getMediaTypePro());
            resultMap.put("mediaAllPro", eventStats.getMediaAllPro());
            resultMap.put("mediaClassAvg", eventStats.getMediaClassAvg());
            resultMap.put("mediaNum", eventStats.getMediaNum());
            resultMap.put("ccpMediaIn", eventStats.getCcpMediaIn());
            resultMap.put("ccpTypePro", eventStats.getCcpTypePro());
            resultMap.put("ccpAllPro", eventStats.getCcpAllPro());
            resultMap.put("ccpClassAvg", eventStats.getCcpClassAvg());
            resultMap.put("financeMediaIn", eventStats.getCcpMediaIn());
            resultMap.put("financeTypePro", eventStats.getFinanceTypePro());
            resultMap.put("financeAllPro", eventStats.getFinanceAllPro());
            resultMap.put("financeClassAvg", eventStats.getFinanceClassAvg());
            resultMap.put("techMediaIn", eventStats.getTechMediaIn());
            resultMap.put("techTypePro", eventStats.getTechTypePro());
            resultMap.put("techAllPro", eventStats.getTechAllPro());
            resultMap.put("techClassAvg", eventStats.getTechClassAvg());
        } else {
            resultMap.put("errMsp", "事件不存在");
        }
        return resultMap;
    }

    @Override
    public Map<String, Object> getRelaventEvents(String eventId) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        List<Map> classEventList = new ArrayList<>();
        List<Map> relaventEventList = new ArrayList<>();
        EventRelaventCaseExample eventRelaventCaseExample = new EventRelaventCaseExample();
        eventRelaventCaseExample.createCriteria().andEventIdEqualTo(eventId).andRelaventTypeEqualTo((byte) 0);
        List<EventRelaventCase> classEvents = eventRelaventCaseMapper.selectByExample(eventRelaventCaseExample);
        eventRelaventCaseExample.clear();
        eventRelaventCaseExample.createCriteria().andEventIdEqualTo(eventId).andRelaventTypeEqualTo((byte) 1);
        List<EventRelaventCase> relaventEvents = eventRelaventCaseMapper.selectByExample(eventRelaventCaseExample);
        if (classEvents.size() > 0 || relaventEvents.size() > 0) {
            for (EventRelaventCase classEvent : classEvents) {
                Map<String, Object> classEventMap = new LinkedHashMap<>();
                classEventMap.put("eventId", classEvent.getRelaventEventId());
                classEventMap.put("point", classEvent.getPoint() + "th");
                classEventMap.put("title", classEvent.getTitle());
                classEventMap.put("infExponent", classEvent.getInfoExponent());
                classEventList.add(classEventMap);
            }
            for (EventRelaventCase relaventEvent : relaventEvents) {
                Map<String, Object> relaventEventMap = new LinkedHashMap<>();
                relaventEventMap.put("eventId", relaventEvent.getRelaventEventId());
                relaventEventMap.put("title", relaventEvent.getTitle());
                relaventEventMap.put("imgUrl", relaventEvent.getImgUrl());
                relaventEventList.add(relaventEventMap);
            }
            resultMap.put("classEvents", classEventList);
            resultMap.put("relaventEvents", relaventEventList);
        } else {
            resultMap.put("errMsg", "该事件无同类或相关事件数据");
        }
        return resultMap;
    }

    @Override
    public Map<String, Object> getEventHeatRatio(String eventId) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        List<Map> dayList = new ArrayList<>();
        List<Map> hourList = new ArrayList<>();
        EventHeatRatioExample eventHeatRatioExample = new EventHeatRatioExample();
        eventHeatRatioExample.createCriteria().andEventIdEqualTo(eventId).andHeatTypeEqualTo((byte) 0);
        List<EventHeatRatio> dayHeatRatioList = eventHeatRatioMapper.selectByExample(eventHeatRatioExample);
        eventHeatRatioExample.clear();
        eventHeatRatioExample.createCriteria().andEventIdEqualTo(eventId).andHeatTypeEqualTo((byte) 1);
        List<EventHeatRatio> hourHeatRatioList = eventHeatRatioMapper.selectByExample(eventHeatRatioExample);
        if (dayHeatRatioList.size() > 0 || hourHeatRatioList.size() > 0) {
            Collections.reverse(dayHeatRatioList);
            for (EventHeatRatio dayHeatRatio : dayHeatRatioList) {
                assembleHeatList(dayList, dayHeatRatio);
            }
            Collections.reverse(hourHeatRatioList);
            for (int i = 0; i < hourHeatRatioList.size() - 1; i++) {
                EventHeatRatio hourHeatRatio = hourHeatRatioList.get(i);
                assembleHeatList(hourList, hourHeatRatio);
            }
            String nowTimePoint = hourHeatRatioList.get(24).getTimePoint();
            resultMap.put("nowTimePoint", nowTimePoint.substring(nowTimePoint.length() - 2));
            resultMap.put("nowPoint", hourHeatRatioList.get(24).getPoint());
            resultMap.put("nowPro", hourHeatRatioList.get(24).getPro());
            resultMap.put("nowHeatValue", hourHeatRatioList.get(24).getHeatValue());
            resultMap.put("dayHeatRatio", dayList);
            resultMap.put("hourHeatRatio", hourList);
        } else {
            resultMap.put("errMsg", "该事件无热度数据");
        }
        return resultMap;
    }

    /**
     * 组装热度list
     *
     * @param heatList  返回的热度结果集
     * @param heatRatio 热度对象
     */
    private void assembleHeatList(List<Map> heatList, EventHeatRatio heatRatio) {
        Map<String, Object> heatMap = new LinkedHashMap<>();
        heatMap.put("timePoint", heatRatio.getTimePoint());
        heatMap.put("heatValue", heatRatio.getHeatValue());
        heatMap.put("point", heatRatio.getPoint());
        heatMap.put("pro", heatRatio.getPro());
        heatList.add(heatMap);
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
            String nowTimePoint = ((JSONObject) hourHeat.get(hourHeat.size() - 1)).getString("timePoint");
            //获取未结束事件小时热度list的长度，某些事件元素不足25个，需要补全前面为空的元素
            int hourHeatSize = hourHeat.size();
            int sizeDValue = 25 - hourHeatSize;//计算需要补全的空元素个数
            ((JSONObject) hourHeat.get(hourHeatSize - 1)).put("pro", jsonObject.getJSONObject("hourNowRankMap").getBigDecimal("pro"));
            ((JSONObject) hourHeat.get(hourHeatSize - 1)).put("point", jsonObject.getJSONObject("hourNowRankMap").getInteger("point") + 1);
            ((JSONObject) hourHeat.get(hourHeatSize - 1)).put("hE", jsonObject.getJSONObject("hourNowRankMap").getBigDecimal("hE"));
            if (sizeDValue > 0) {
                String[] calculatedPastHourArray;
                String startTimePoint = ((JSONObject) hourHeat.get(0)).getString("timePoint");
                try {
                    calculatedPastHourArray = DateUtil.getCalculateDay(startTimePoint, -sizeDValue, DateUtil.HOUR_PATTERN, DateUtil.ONE_HOUR_TIME);
                } catch (ParseException e) {
                    throw new WeiboException(EmWeiboError.UNKNOW_ERROR.setErrMsg("profileService解析时间格式失败"));
                }
                completeHeatRatio(resultArray, sizeDValue, calculatedPastHourArray);
                resultArray.addAll(hourHeat);
            } else {
                resultArray.addAll(hourHeat.subList(hourHeatSize - 25, hourHeatSize));
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
                completeHeatRatio(resultArray, sizeDValue, calculatedPastDayrArray);
                resultArray.addAll(dayHeat);
            } else {
                resultArray.addAll(dayHeat.subList(dayHeatSize - 7, dayHeatSize));
            }
        }
        return resultArray;
    }

    /**
     * 补充每天和每小时热度与7天和24小时有差值的部分
     *
     * @param resultArray             热度结果集
     * @param sizeDValue              差值
     * @param calculatedPastDayrArray 计算差值时间
     */
    private void completeHeatRatio(JSONArray resultArray, int sizeDValue, String[] calculatedPastDayrArray) {
        for (int i = 0; i < sizeDValue; i++) {
            JSONObject newDayHeat = new JSONObject();
            newDayHeat.put("pro", 0);
            newDayHeat.put("point", 0);
            newDayHeat.put("hE", 0);
            newDayHeat.put("timePoint", calculatedPastDayrArray[sizeDValue - 1 - i]);
            resultArray.add(newDayHeat);
        }
    }


}
