package com.unicom.service;

public interface ProfileService {

    /**
     * 根据事件id从api爬取事件概况
     * @param eventId
     * @return
     */
    public String crawlProfileData(String eventId);

    /**
     * 解析事件概况数据并存入数据库
     * @param data 事件概况数据
     * @param eventId
     */
    public void handlProfileData(String data, String eventId);

    /**
     * 根据事件id从数据库获取事件概况
     * @param eventId
     * @return
     */
    public String getProfileData(String eventId);
}
