package com.unicom.model;

import java.math.BigDecimal;
import java.util.Date;

public class IndexStats {
    private Integer id;

    private Integer eventId;

    private String title;

    private String img;

    private String firstType;

    private String rankDayTime;

    private Integer sumHeat;

    private Integer heatExponent;

    private BigDecimal pro;

    private Integer dayHeatAvg;

    private Byte isDay;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updater;

    public IndexStats(Integer id, Integer eventId, String title, String img, String firstType, String rankDayTime, Integer sumHeat, Integer heatExponent, BigDecimal pro, Integer dayHeatAvg, Byte isDay, Date createTime, String creator, Date updateTime, String updater) {
        this.id = id;
        this.eventId = eventId;
        this.title = title;
        this.img = img;
        this.firstType = firstType;
        this.rankDayTime = rankDayTime;
        this.sumHeat = sumHeat;
        this.heatExponent = heatExponent;
        this.pro = pro;
        this.dayHeatAvg = dayHeatAvg;
        this.isDay = isDay;
        this.createTime = createTime;
        this.creator = creator;
        this.updateTime = updateTime;
        this.updater = updater;
    }

    public IndexStats() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getFirstType() {
        return firstType;
    }

    public void setFirstType(String firstType) {
        this.firstType = firstType == null ? null : firstType.trim();
    }

    public String getRankDayTime() {
        return rankDayTime;
    }

    public void setRankDayTime(String rankDayTime) {
        this.rankDayTime = rankDayTime == null ? null : rankDayTime.trim();
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

    public Integer getDayHeatAvg() {
        return dayHeatAvg;
    }

    public void setDayHeatAvg(Integer dayHeatAvg) {
        this.dayHeatAvg = dayHeatAvg;
    }

    public Byte getIsDay() {
        return isDay;
    }

    public void setIsDay(Byte isDay) {
        this.isDay = isDay;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }
}