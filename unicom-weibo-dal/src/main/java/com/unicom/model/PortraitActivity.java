package com.unicom.model;

import java.math.BigDecimal;
import java.util.Date;

public class PortraitActivity {
    private Integer activityId;

    private String eventId;

    private String title;

    private Byte activity;

    private BigDecimal pro;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updater;

    public PortraitActivity(Integer activityId, String eventId, String title, Byte activity, BigDecimal pro, Date createTime, String creator, Date updateTime, String updater) {
        this.activityId = activityId;
        this.eventId = eventId;
        this.title = title;
        this.activity = activity;
        this.pro = pro;
        this.createTime = createTime;
        this.creator = creator;
        this.updateTime = updateTime;
        this.updater = updater;
    }

    public PortraitActivity() {
        super();
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
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

    public Byte getActivity() {
        return activity;
    }

    public void setActivity(Byte activity) {
        this.activity = activity;
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