package com.unicom.model;

import java.math.BigDecimal;
import java.util.Date;

public class EventIndicator {
    private Integer id;

    private String eventId;

    private BigDecimal avgVel;

    private Byte isEnd;

    private Integer maxVel;

    private String continuedTime;

    private BigDecimal nearHotInf;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updater;

    public EventIndicator(Integer id, String eventId, BigDecimal avgVel, Byte isEnd, Integer maxVel, String continuedTime, BigDecimal nearHotInf, Date createTime, String creator, Date updateTime, String updater) {
        this.id = id;
        this.eventId = eventId;
        this.avgVel = avgVel;
        this.isEnd = isEnd;
        this.maxVel = maxVel;
        this.continuedTime = continuedTime;
        this.nearHotInf = nearHotInf;
        this.createTime = createTime;
        this.creator = creator;
        this.updateTime = updateTime;
        this.updater = updater;
    }

    public EventIndicator() {
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

    public BigDecimal getAvgVel() {
        return avgVel;
    }

    public void setAvgVel(BigDecimal avgVel) {
        this.avgVel = avgVel;
    }

    public Byte getIsEnd() {
        return isEnd;
    }

    public void setIsEnd(Byte isEnd) {
        this.isEnd = isEnd;
    }

    public Integer getMaxVel() {
        return maxVel;
    }

    public void setMaxVel(Integer maxVel) {
        this.maxVel = maxVel;
    }

    public String getContinuedTime() {
        return continuedTime;
    }

    public void setContinuedTime(String continuedTime) {
        this.continuedTime = continuedTime == null ? null : continuedTime.trim();
    }

    public BigDecimal getNearHotInf() {
        return nearHotInf;
    }

    public void setNearHotInf(BigDecimal nearHotInf) {
        this.nearHotInf = nearHotInf;
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

    @Override
    public String toString() {
        return "EventIndicator{" +
                "id=" + id +
                ", eventId='" + eventId + '\'' +
                ", avgVel=" + avgVel +
                ", isEnd=" + isEnd +
                ", maxVel=" + maxVel +
                ", continuedTime='" + continuedTime + '\'' +
                ", nearHotInf=" + nearHotInf +
                ", createTime=" + createTime +
                ", creator='" + creator + '\'' +
                ", updateTime=" + updateTime +
                ", updater='" + updater + '\'' +
                '}';
    }
}