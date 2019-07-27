package com.unicom.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public interface ProfileService {

    /**
     * 根据事件id从api爬取事件概况
     *
     * @param eventId 事件id
     * @return
     */
    String crawlProfileData(String eventId);

    /**
     * 解析事件概况数据并存入数据库
     *
     * @param data    事件概况数据
     * @param eventId 事件id
     */
    void handleProfileData(String data, String eventId);

    /**
     * 根据事件id从数据库获取事件概况EventInfo
     *
     * @param eventId 事件id
     * @return
     */
    Map<String, Object> getEventInfoData(String eventId);

    /**
     * 根据事件id从数据库获取事件概况Stats
     *
     * @param eventId 事件id
     * @return
     */
    Map<String, Object> getStats(String eventId);

    /**
     * 根据事件id从数据库获取事件概况同类事件及相关事件
     *
     * @param eventId 事件id
     * @return
     */
    Map<String, Object> getRelaventEvents(String eventId);

    /**
     * 根据事件id从数据库获取事件概况热度信息
     *
     * @param eventId 事件id
     * @return
     */
    Map<String, Object> getEventHeatRatio(String eventId);

    /**
     * 根据事件是否已结束处理数据并返回24小时的热度数据
     *
     * @param jsonObject
     * @return
     */
    JSONArray handleHourHeatRatio(JSONObject jsonObject);

    /**
     * 根据事件是否已结束处理数据并返回7日的热度数据
     *
     * @param jsonObject
     * @return
     */
    JSONArray handleDayHeatRatio(JSONObject jsonObject);
}
