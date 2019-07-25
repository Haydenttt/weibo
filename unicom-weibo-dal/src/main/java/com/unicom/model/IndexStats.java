package com.unicom.model;

import java.math.BigDecimal;
import java.util.Date;

public class IndexStats {
    private Integer id;

    private String eventId;

    private String title;

    private String img;

    private String firstType;

    private String rankTime;

    private Integer sumHeat;

    private Integer heatExponent;

    private BigDecimal pro;

    private Integer lastRank;

    private Byte isDay;

    private Byte isValid;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updater;

    private Integer currentRank;

    public IndexStats(Integer id, String eventId, String title, String img, String firstType, String rankTime, Integer sumHeat, Integer heatExponent, BigDecimal pro, Integer lastRank, Byte isDay, Byte isValid, Date createTime, String creator, Date updateTime, String updater, Integer currentRank) {
        this.id = id;
        this.eventId = eventId;
        this.title = title;
        this.img = img;
        this.firstType = firstType;
        this.rankTime = rankTime;
        this.sumHeat = sumHeat;
        this.heatExponent = heatExponent;
        this.pro = pro;
        this.lastRank = lastRank;
        this.isDay = isDay;
        this.isValid = isValid;
        this.createTime = createTime;
        this.creator = creator;
        this.updateTime = updateTime;
        this.updater = updater;
        this.currentRank = currentRank;
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

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId == null ? null : eventId.trim();
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

    public String getRankTime() {
        return rankTime;
    }

    public void setRankTime(String rankTime) {
        this.rankTime = rankTime == null ? null : rankTime.trim();
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

    public Integer getLastRank() {
        return lastRank;
    }

    public void setLastRank(Integer lastRank) {
        this.lastRank = lastRank;
    }

    public Byte getIsDay() {
        return isDay;
    }

    public void setIsDay(Byte isDay) {
        this.isDay = isDay;
    }

    public Byte getIsValid() {
        return isValid;
    }

    public void setIsValid(Byte isValid) {
        this.isValid = isValid;
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

    public Integer getCurrentRank() {
        return currentRank;
    }

    public void setCurrentRank(Integer currentRank) {
        this.currentRank = currentRank;
    }
}