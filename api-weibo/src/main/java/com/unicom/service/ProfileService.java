package com.unicom.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.unicom.model.EventInfo;

public interface ProfileService {

    /**
     * 根据事件id从api爬取事件概况
     *
     * @param eventId
     * @return
     */
    String crawlProfileData(String eventId);

    /**
     * 解析事件概况数据并存入数据库
     *
     * @param data    事件概况数据
     * @param eventId
     */
    void handlProfileData(String data, String eventId);


    /**
     * 根据事件id从数据库获取事件概况EventInfo
     *
     * @param eventId
     * @return
     */
    EventInfo getEventInfoData(String eventId);

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
