package com.unicom.service.vo;

import com.alibaba.fastjson.JSONArray;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @program: unicom-weibo
 * @description:
 * @author: Hayden TONG
 * @create: 2019-07-25 14:30
 **/
public class IndexStatsVO {

    private String eventId;

    private String title;

    private String img;

    private String rankTime;

    private Integer sumHeat;

    private Integer heatExponent;

    private BigDecimal pro;

    private Integer currentRank;

    private Integer lastRank;

    private Integer tendency;

    public IndexStatsVO() {
    }

    public IndexStatsVO(String eventId, String title, String img, String rankTime, Integer sumHeat, Integer heatExponent, BigDecimal pro, Integer currentRank, Integer lastRank, Integer tendency, Byte isDay) {
        this.eventId = eventId;
        this.title = title;
        this.img = img;
        this.rankTime = rankTime;
        this.sumHeat = sumHeat;
        this.heatExponent = heatExponent;
        this.pro = pro;
        this.currentRank = currentRank;
        this.lastRank = lastRank;
        this.tendency = tendency;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getRankTime() {
        return rankTime;
    }

    public void setRankTime(String rankTime) {
        this.rankTime = rankTime;
    }

    public Integer getSumHeat() {
        return sumHeat;
    }

    public void setSumHeat(Integer sumHeat) {
        this.sumHeat = sumHeat;
    }

    public Integer getHeatExponent() {
        return heatExponent;
    }

    public void setHeatExponent(Integer heatExponent) {
        this.heatExponent = heatExponent;
    }

    public BigDecimal getPro() {
        return pro;
    }

    public void setPro(BigDecimal pro) {
        this.pro = pro;
    }

    public Integer getCurrentRank() {
        return currentRank;
    }

    public void setCurrentRank(Integer currentRank) {
        this.currentRank = currentRank;
    }

    public Integer getLastRank() {
        return lastRank;
    }

    public void setLastRank(Integer lastRank) {
        this.lastRank = lastRank;
    }

    public Integer getTendency() {
        return tendency;
    }

    public void setTendency(Integer tendency) {
        this.tendency = tendency;
    }

}
