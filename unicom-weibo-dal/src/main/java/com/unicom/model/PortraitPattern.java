package com.unicom.model;

import java.math.BigDecimal;
import java.util.Date;

public class PortraitPattern {
    private Integer patternId;

    private String eventId;

    private BigDecimal weboNum;

    private String time;

    private Byte accountType;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updater;

    public PortraitPattern(Integer patternId, String eventId, BigDecimal weboNum, String time, Byte accountType, Date createTime, String creator, Date updateTime, String updater) {
        this.patternId = patternId;
        this.eventId = eventId;
        this.weboNum = weboNum;
        this.time = time;
        this.accountType = accountType;
        this.createTime = createTime;
        this.creator = creator;
        this.updateTime = updateTime;
        this.updater = updater;
    }

    public PortraitPattern() {
        super();
    }

    public Integer getPatternId() {
        return patternId;
    }

    public void setPatternId(Integer patternId) {
        this.patternId = patternId;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId == null ? null : eventId.trim();
    }

    public BigDecimal getWeboNum() {
        return weboNum;
    }

    public void setWeboNum(BigDecimal weboNum) {
        this.weboNum = weboNum;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Byte getAccountType() {
        return accountType;
    }

    public void setAccountType(Byte accountType) {
        this.accountType = accountType;
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