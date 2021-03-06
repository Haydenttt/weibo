package com.unicom.model;

import java.math.BigDecimal;
import java.util.Date;

public class IndexMonthEventAll {
    private Integer id;

    private String eventId;

    private String title;

    private String img;

    private String firstType;

    private String startTime;

    private BigDecimal infExponent;

    private String tags;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updater;

    public IndexMonthEventAll(Integer id, String eventId, String title, String img, String firstType, String startTime, BigDecimal infExponent, String tags, Date createTime, String creator, Date updateTime, String updater) {
        this.id = id;
        this.eventId = eventId;
        this.title = title;
        this.img = img;
        this.firstType = firstType;
        this.startTime = startTime;
        this.infExponent = infExponent;
        this.tags = tags;
        this.createTime = createTime;
        this.creator = creator;
        this.updateTime = updateTime;
        this.updater = updater;
    }

    public IndexMonthEventAll() {
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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public BigDecimal getInfExponent() {
        return infExponent;
    }

    public void setInfExponent(BigDecimal infExponent) {
        this.infExponent = infExponent;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
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