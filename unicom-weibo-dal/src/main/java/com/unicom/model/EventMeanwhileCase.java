package com.unicom.model;

import java.util.Date;

public class EventMeanwhileCase {
    private Integer id;

    private String eventId;

    private String relaventEventId;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updater;

    public EventMeanwhileCase(Integer id, String eventId, String relaventEventId, Date createTime, String creator, Date updateTime, String updater) {
        this.id = id;
        this.eventId = eventId;
        this.relaventEventId = relaventEventId;
        this.createTime = createTime;
        this.creator = creator;
        this.updateTime = updateTime;
        this.updater = updater;
    }

    public EventMeanwhileCase() {
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

    public String getRelaventEventId() {
        return relaventEventId;
    }

    public void setRelaventEventId(String relaventEventId) {
        this.relaventEventId = relaventEventId == null ? null : relaventEventId.trim();
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