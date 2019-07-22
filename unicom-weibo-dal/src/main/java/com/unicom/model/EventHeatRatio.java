package com.unicom.model;

import java.math.BigDecimal;
import java.util.Date;

public class EventHeatRatio {
    private Integer id;

    private String eventId;

    private Byte heatType;

    private String timePoint;

    private BigDecimal heatValue;

    private Integer point;

    private BigDecimal pro;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updater;

    public EventHeatRatio(Integer id, String eventId, Byte heatType, String timePoint, BigDecimal heatValue, Integer point, BigDecimal pro, Date createTime, String creator, Date updateTime, String updater) {
        this.id = id;
        this.eventId = eventId;
        this.heatType = heatType;
        this.timePoint = timePoint;
        this.heatValue = heatValue;
        this.point = point;
        this.pro = pro;
        this.createTime = createTime;
        this.creator = creator;
        this.updateTime = updateTime;
        this.updater = updater;
    }

    public EventHeatRatio() {
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

    public Byte getHeatType() {
        return heatType;
    }

    public void setHeatType(Byte heatType) {
        this.heatType = heatType;
    }

    public String getTimePoint() {
        return timePoint;
    }

    public void setTimePoint(String timePoint) {
        this.timePoint = timePoint == null ? null : timePoint.trim();
    }

    public BigDecimal getHeatValue() {
        return heatValue;
    }

    public void setHeatValue(BigDecimal heatValue) {
        this.heatValue = heatValue;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public BigDecimal getPro() {
        return pro;
    }

    public void setPro(BigDecimal pro) {
        this.pro = pro;
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