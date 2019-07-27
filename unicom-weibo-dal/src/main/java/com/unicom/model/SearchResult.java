package com.unicom.model;

import java.math.BigDecimal;
import java.util.Date;

public class SearchResult {
    private Integer id;

    private String eventId;

    private String title;

    private String imgUrl;

    private String firstType;

    private BigDecimal infExponent;

    private String media;

    private String tags;

    private String startTime;

    private String descript;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updater;

    public SearchResult(Integer id, String eventId, String title, String imgUrl, String firstType, BigDecimal infExponent, String media, String tags, String startTime, String descript, Date createTime, String creator, Date updateTime, String updater) {
        this.id = id;
        this.eventId = eventId;
        this.title = title;
        this.imgUrl = imgUrl;
        this.firstType = firstType;
        this.infExponent = infExponent;
        this.media = media;
        this.tags = tags;
        this.startTime = startTime;
        this.descript = descript;
        this.createTime = createTime;
        this.creator = creator;
        this.updateTime = updateTime;
        this.updater = updater;
    }

    public SearchResult() {
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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getFirstType() {
        return firstType;
    }

    public void setFirstType(String firstType) {
        this.firstType = firstType == null ? null : firstType.trim();
    }

    public BigDecimal getInfExponent() {
        return infExponent;
    }

    public void setInfExponent(BigDecimal infExponent) {
        this.infExponent = infExponent;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media == null ? null : media.trim();
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript == null ? null : descript.trim();
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