package com.unicom.service;

import java.util.Map;

public interface TrendService {

    /**
     * 根据事件id从api爬取传播趋势
     *
     * @param eventId
     * @return
     */
    String crawlTrendData(String eventId);

    /**
     * 根据事件id从api爬取传播趋势同期事件数据
     *
     * @param eventId
     * @return
     */
    String crawlTimeLineSameData(String eventId);

    /**
     * 解析传播趋势数据并存入数据库
     *
     * @param data    事件概况数据
     * @param eventId
     */
    void handleTrendData(String data, String eventId);

    /**
     * 解析同期事件传播趋势数据并存入数据库
     *
     * @param data    事件概况数据
     * @param eventId
     */
    void handlTimeLineSameData(String data, String eventId);

    /**
     * 根据事件id组装Json格式的数据到前端
     *
     * @param eventId 事件id
     * @return json字符串
     */
    Map<String, Object> assembleResult(String eventId);

}
