package com.unicom.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.unicom.exception.EmWeiboError;
import com.unicom.exception.WeiboException;
import com.unicom.mapper.EventIndicatorMapper;
import com.unicom.mapper.EventInfoMapper;
import com.unicom.mapper.EventMeanwhileCaseMapper;
import com.unicom.mapper.EventTimelineTrendMapper;
import com.unicom.model.*;
import com.unicom.service.TrendService;
import com.unicom.util.DateUtil;
import com.unicom.util.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @program: weibo
 * @description:
 * @author: lp
 * @create: 2019-07-22 08:54
 **/
@Service
public class TrendServiceImpl implements TrendService {

    private static final String TREND_URL = "http://ef.zhiweidata.com/analy/timeline.do";
    private static final String TIMELINE_SAME_URL = "http://ef.zhiweidata.com/analy/timeLineSame.do";

    private final EventIndicatorMapper eventIndicatorMapper;
    private final EventTimelineTrendMapper eventTimelineTrendMapper;
    private final EventInfoMapper eventInfoMapper;
    private final EventMeanwhileCaseMapper eventMeanwhileCaseMapper;

    @Autowired
    public TrendServiceImpl(EventIndicatorMapper eventIndicatorMapper, EventTimelineTrendMapper eventTimelineTrendMapper, EventInfoMapper eventInfoMapper, EventMeanwhileCaseMapper eventMeanwhileCaseMapper) {
        this.eventIndicatorMapper = eventIndicatorMapper;
        this.eventTimelineTrendMapper = eventTimelineTrendMapper;
        this.eventInfoMapper = eventInfoMapper;
        this.eventMeanwhileCaseMapper = eventMeanwhileCaseMapper;
    }

    @Override
    public String crawlTrendData(String eventId) {
        return HttpUtil.sendPost(TREND_URL, "eventId=" + eventId);
    }

    @Override
    public String crawlTimeLineSameData(String eventId) {
        return HttpUtil.sendPost(TIMELINE_SAME_URL, "eventId=" + eventId);
    }

    @Override
    public void handleTrendData(String data, String eventId) {
        JSONObject dataJson = JSONObject.parseObject(data);
        boolean isEnd = dataJson.getString("isEnd").equals("true");
        EventIndicator eventIndicator = new EventIndicator();
        eventIndicator.setEventId(eventId);
        if (isEnd) {
            eventIndicator.setAvgVel(dataJson.getBigDecimal("avgVelAll"));
        } else {
            eventIndicator.setAvgVel(dataJson.getBigDecimal("avgVel"));
        }
        eventIndicator.setIsEnd(isEnd ? (byte) 1 : 0);
        JSONArray timeLine = dataJson.getJSONArray("timeLine");
        JSONArray weiboTimeLine = dataJson.getJSONArray("weiboTimeLine");
        JSONArray wechatTimeLine = dataJson.getJSONArray("wechatTimeLine");
        JSONArray mediaTimeLine = dataJson.getJSONArray("mediaTimeLine");
        //计算timeLine中每小时num的最大值作为峰值传播速度
        int maxNum = 0;
        for (Object timePoint : timeLine) {
            int numTmp = ((JSONObject) timePoint).getInteger("num");
            if (numTmp > maxNum) {
                maxNum = numTmp;
            }
        }
        eventIndicator.setMaxVel(maxNum);
        eventIndicator.setContinuedTime(DateUtil.periodToString(dataJson.getLong("continuedTime")));
        eventIndicator.setNearHotInf(dataJson.getBigDecimal("nearHotInf"));
        eventIndicator.setCreator("lp");
        eventIndicator.setUpdater("lp");

        //判断库中是否已有该事件数据，如果有则更新，没有则插入
        EventIndicatorExample eventIndicatorExample = new EventIndicatorExample();
        EventIndicatorExample.Criteria eventIndicatorExampleCriteria = eventIndicatorExample.createCriteria();
        eventIndicatorExampleCriteria.andEventIdEqualTo(eventId);
        List<EventIndicator> eventIndicatorList = eventIndicatorMapper.selectByExample(eventIndicatorExample);
        if (eventIndicatorList.size() > 0) {
            eventIndicatorMapper.updateByExampleSelective(eventIndicator, eventIndicatorExample);
        } else {
            eventIndicatorMapper.insertSelective(eventIndicator);
        }

        //对于4个趋势图的数据，根据事件先全部删除再逐条插入。
        EventTimelineTrendExample eventTimelineTrendExample = new EventTimelineTrendExample();
        eventTimelineTrendExample.clear();
        eventTimelineTrendExample.createCriteria().andEventIdEqualTo(eventId);
        eventTimelineTrendMapper.deleteByExample(eventTimelineTrendExample);
        insertTimeLine(eventId, timeLine, (byte) 0);
        insertTimeLine(eventId, weiboTimeLine, (byte) 1);
        insertTimeLine(eventId, wechatTimeLine, (byte) 2);
        insertTimeLine(eventId, mediaTimeLine, (byte) 3);
    }

    @Override
    public void handlTimeLineSameData(String data, String eventId) {
        JSONObject dataJson = JSONObject.parseObject(data);
        System.out.println(dataJson);
        JSONArray timeLineSameArray = dataJson.getJSONArray("sameTime");
        System.out.println(timeLineSameArray);
        EventInfoExample eventInfoExample = new EventInfoExample();
        EventMeanwhileCaseExample eventMeanwhileCaseExample = new EventMeanwhileCaseExample();
        EventTimelineTrendExample eventTimelineTrendExample = new EventTimelineTrendExample();
        //遍历sameTimeLine
        for (Object timeLineSame : timeLineSameArray) {
            JSONObject timeLineObj = (JSONObject) timeLineSame;

            // 判断event_info表中是否已有该事件，没有则插入,否则不作操作
            EventInfo eventInfo = new EventInfo();
            eventInfo.setEventId(timeLineObj.getString("id"));
            eventInfo.setTitle(timeLineObj.getString("name"));
            eventInfo.setDescription("");//填充非Null字段
            eventInfo.setFirstType("");//填充非Null字段
            eventInfo.setTags("");//填充非Null字段
            eventInfo.setStartTime(new Date());//填充非Null字段
            eventInfo.setIsEnd((byte) 3);//不知道是否已结束，填补空缺用
            eventInfo.setCreator("lp");
            eventInfo.setUpdater("lp");
            eventInfoExample.clear();
            eventInfoExample.createCriteria().andEventIdEqualTo(eventInfo.getEventId());
            List<EventInfo> eventInfoList = eventInfoMapper.selectByExample(eventInfoExample);
            if (eventInfoList.size() == 0) {
                eventInfoMapper.insertSelective(eventInfo);
            }

            // 判断event_meanwhile_case表中是否已有该事件及关联事件，没有则插入,否则不作操作
            EventMeanwhileCase eventMeanwhileCase = new EventMeanwhileCase();
            eventMeanwhileCase.setEventId(eventId);
            eventMeanwhileCase.setRelaventEventId(eventInfo.getEventId());
            eventMeanwhileCase.setCreator("lp");
            eventMeanwhileCase.setUpdater("lp");
            eventMeanwhileCaseExample.clear();
            eventMeanwhileCaseExample.createCriteria().andEventIdEqualTo(eventId).andRelaventEventIdEqualTo(eventInfo.getEventId());
            List<EventMeanwhileCase> eventMeanwhileCases = eventMeanwhileCaseMapper.selectByExample(eventMeanwhileCaseExample);
            if (eventMeanwhileCases.size() == 0) {
                eventMeanwhileCaseMapper.insertSelective(eventMeanwhileCase);
            }

            //遍历各同期事件timeLine,先全部删除
            eventTimelineTrendExample.clear();
            eventTimelineTrendExample.createCriteria().andEventIdEqualTo(eventInfo.getEventId()).andPlatformTypeEqualTo((byte) 0);
            eventTimelineTrendMapper.deleteByExample(eventTimelineTrendExample);
            insertTimeLine(eventInfo.getEventId(), timeLineObj.getJSONArray("hourTimeLine"), (byte) 0);

        }
    }

    /**
     * 分平台插入传播趋势数据
     *
     * @param eventId      事件id
     * @param timeLine     时间线
     * @param platformType 0-全局，1-微博，2-微信，3-网媒
     */
    private void insertTimeLine(String eventId, JSONArray timeLine, Byte platformType) {
        for (Object timePoint : timeLine) {
            EventTimelineTrend eventTimelineTrend = new EventTimelineTrend();
            eventTimelineTrend.setEventId(eventId);
            eventTimelineTrend.setPlatformType(platformType);
            eventTimelineTrend.setTime(((JSONObject) timePoint).getString("time"));
            eventTimelineTrend.setNum(((JSONObject) timePoint).getInteger("num"));
            eventTimelineTrend.setCreator("lp");
            eventTimelineTrend.setUpdater("lp");
            eventTimelineTrendMapper.insertSelective(eventTimelineTrend);
        }
    }

    /**
     * 根据事件id获取5个同期事件
     *
     * @param eventId 事件id
     * @return 同期事件list
     */
    private List<EventMeanwhileCase> getMeanwhileEvents(String eventId) {
        EventMeanwhileCaseExample eventMeanwhileCaseExample = new EventMeanwhileCaseExample();
        eventMeanwhileCaseExample.createCriteria().andEventIdEqualTo(eventId);
        List<EventMeanwhileCase> eventMeanwhileCaseList = eventMeanwhileCaseMapper.selectByExample(eventMeanwhileCaseExample);
        return new ArrayList<>(eventMeanwhileCaseList);
    }

    public Map<String, Object> assembleResult(String eventId) {
        Map<String, Object> resultMap = new LinkedHashMap<>();
        EventIndicatorExample eventIndicatorExample = new EventIndicatorExample();
        eventIndicatorExample.createCriteria().andEventIdEqualTo(eventId);
        List<EventIndicator> eventIndicatorList = eventIndicatorMapper.selectByExample(eventIndicatorExample);

        EventTimelineTrendExample eventTimelineTrendExample = new EventTimelineTrendExample();
        eventTimelineTrendExample.createCriteria().andEventIdEqualTo(eventId).andPlatformTypeEqualTo((byte) 0);

        EventInfoExample eventInfoExample = new EventInfoExample();
        List<EventTimelineTrend> eventTimelineTrendList = eventTimelineTrendMapper.selectByExample(eventTimelineTrendExample);
        if (eventIndicatorList.size() > 0) {
            try {
                resultMap.put("eventId", eventId);
                eventInfoExample.clear();
                eventInfoExample.createCriteria().andEventIdEqualTo(eventId);
                EventInfo eventInfo = eventInfoMapper.selectByExample(eventInfoExample).get(0);
                resultMap.put("title", eventInfo.getTitle());
                resultMap.put("imgUrl", eventInfo.getImgUrl());
                EventIndicator eventIndicator = eventIndicatorList.get(0);
                resultMap.put("nearHotInf", eventIndicator.getNearHotInf());
                resultMap.put("avgVel", eventIndicator.getAvgVel());
                resultMap.put("topVel", eventIndicator.getMaxVel());
                resultMap.put("continuedTime", eventIndicator.getContinuedTime());
                List<String> timeList = new ArrayList<>();
                for (EventTimelineTrend eventTimelineTrend : eventTimelineTrendList) {
                    timeList.add(eventTimelineTrend.getTime());
                }
                resultMap.put("xLine", timeList);
                List<Integer> numList = new ArrayList<>();
                List<Integer> weiboNumList = new ArrayList<>();
                List<Integer> wechatNumList = new ArrayList<>();
                List<Integer> mediaNumList = new ArrayList<>();
                //全局传播趋势timeLine数值
                for (EventTimelineTrend eventTimelineTrend : eventTimelineTrendList) {
                    numList.add(eventTimelineTrend.getNum());
                }
                resultMap.put("quanjv", numList);

                eventTimelineTrendExample.clear();
                eventTimelineTrendExample.createCriteria().andEventIdEqualTo(eventId).andPlatformTypeEqualTo((byte) 1);
                List<EventTimelineTrend> weiboTimeLineList = eventTimelineTrendMapper.selectByExample(eventTimelineTrendExample);
                //微博传播趋势timeLine数值
                for (EventTimelineTrend eventTimelineTrend : weiboTimeLineList) {
                    weiboNumList.add(eventTimelineTrend.getNum());
                }
                resultMap.put("weibo", weiboNumList);

                eventTimelineTrendExample.clear();
                eventTimelineTrendExample.createCriteria().andEventIdEqualTo(eventId).andPlatformTypeEqualTo((byte) 2);
                List<EventTimelineTrend> wechatTimeLineList = eventTimelineTrendMapper.selectByExample(eventTimelineTrendExample);
                //微信传播趋势timeLine数值
                for (EventTimelineTrend eventTimelineTrend : wechatTimeLineList) {
                    wechatNumList.add(eventTimelineTrend.getNum());
                }
                resultMap.put("weixin", wechatNumList);

                eventTimelineTrendExample.clear();
                eventTimelineTrendExample.createCriteria().andEventIdEqualTo(eventId).andPlatformTypeEqualTo((byte) 3);
                List<EventTimelineTrend> mediaTimeLineList = eventTimelineTrendMapper.selectByExample(eventTimelineTrendExample);
                //网媒传播趋势timeLine数值
                for (EventTimelineTrend eventTimelineTrend : mediaTimeLineList) {
                    mediaNumList.add(eventTimelineTrend.getNum());
                }
                resultMap.put("wangmei", mediaNumList);
                eventInfoExample.clear();
                eventTimelineTrendExample.clear();
                List<EventMeanwhileCase> eventMeanwhileCaseList = getMeanwhileEvents(eventId);
                int index = 1;
                for (EventMeanwhileCase eventMeanwhileCase : eventMeanwhileCaseList) {
                    Map<String, Object> map = new LinkedHashMap<>();
                    eventInfoExample.clear();
                    eventInfoExample.createCriteria().andEventIdEqualTo(eventMeanwhileCase.getRelaventEventId());
                    String eventTitle = eventInfoMapper.selectByExample(eventInfoExample).get(0).getTitle();//根据同期事件id获取事件标题
                    eventTimelineTrendExample.clear();
                    eventTimelineTrendExample.createCriteria().andEventIdEqualTo(eventMeanwhileCase.getRelaventEventId()).andPlatformTypeEqualTo((byte) 0);
                    List<Integer> meanwhileNumList = new ArrayList<>();
                    List<EventTimelineTrend> meanwhileCaseTimelineList = eventTimelineTrendMapper.selectByExample(eventTimelineTrendExample);
                    for (EventTimelineTrend eventTimelineTrend : meanwhileCaseTimelineList) {
                        meanwhileNumList.add(eventTimelineTrend.getNum());
                    }
                    map.put("name", eventTitle);
                    map.put("value", meanwhileNumList);
                    resultMap.put("line" + index, map);
                    index++;
                }
            } catch (Exception e) {
                throw new WeiboException(EmWeiboError.UNKNOW_ERROR.setErrMsg("解析传播趋势json失败"));
            }
        } else {
            resultMap.put("errMsg", "该事件无传播趋势数据！");
        }
        return resultMap;
    }
}
