package com.unicom.model;

import java.math.BigDecimal;
import java.util.Date;

public class EventRelaventCase {
    private Integer id;

    private String eventId;

    private Byte relaventType;

    private String relaventEventId;

    private Integer point;

    private String title;

    private BigDecimal infoExponent;

    private String imgUrl;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updater;

    public EventRelaventCase(Integer id, String eventId, Byte relaventType, String relaventEventId, Integer point, String title, BigDecimal infoExponent, String imgUrl, Date createTime, String creator, Date updateTime, String updater) {
        this.id = id;
        this.eventId = eventId;
        this.relaventType = relaventType;
        this.relaventEventId = relaventEventId;
        this.point = point;
        this.title = title;
        this.infoExponent = infoExponent;
        this.imgUrl = imgUrl;
        this.createTime = createTime;
        this.creator = creator;
        this.updateTime = updateTime;
        this.updater = updater;
    }

    public EventRelaventCase() {
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

    public Byte getRelaventType() {
        return relaventType;
    }

    public void setRelaventType(Byte relaventType) {
        this.relaventType = relaventType;
    }

    public String getRelaventEventId() {
        return relaventEventId;
    }

    public void setRelaventEventId(String relaventEventId) {
        this.relaventEventId = relaventEventId == null ? null : relaventEventId.trim();
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public BigDecimal getInfoExponent() {
        return infoExponent;
    }

    public void setInfoExponent(BigDecimal infoExponent) {
        this.infoExponent = infoExponent;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
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