package com.unicom.model;

import java.util.Date;

public class EventInfo {
    private Integer id;

    private String eventId;

    private String title;

    private String description;

    private String firstType;

    private Date startTime;

    private String tags;

    private Byte isEnd;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updater;

    public EventInfo(Integer id, String eventId, String title, String description, String firstType, Date startTime, String tags, Byte isEnd, Date createTime, String creator, Date updateTime, String updater) {
        this.id = id;
        this.eventId = eventId;
        this.title = title;
        this.description = description;
        this.firstType = firstType;
        this.startTime = startTime;
        this.tags = tags;
        this.isEnd = isEnd;
        this.createTime = createTime;
        this.creator = creator;
        this.updateTime = updateTime;
        this.updater = updater;
    }

    public EventInfo() {
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
        this.eventId = eventId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getFirstType() {
        return firstType;
    }

    public void setFirstType(String firstType) {
        this.firstType = firstType == null ? null : firstType.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public Byte getIsEnd() {
        return isEnd;
    }

    public void setIsEnd(Byte isEnd) {
        this.isEnd = isEnd;
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