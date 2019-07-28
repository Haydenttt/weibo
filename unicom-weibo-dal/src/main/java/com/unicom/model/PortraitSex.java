package com.unicom.model;

import java.math.BigDecimal;
import java.util.Date;

public class PortraitSex {
    private Integer sexId;

    private String eventId;

    private Byte sex;

    private BigDecimal pro;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updater;

    public PortraitSex(Integer sexId, String eventId, Byte sex, BigDecimal pro, Date createTime, String creator, Date updateTime, String updater) {
        this.sexId = sexId;
        this.eventId = eventId;
        this.sex = sex;
        this.pro = pro;
        this.createTime = createTime;
        this.creator = creator;
        this.updateTime = updateTime;
        this.updater = updater;
    }

    public PortraitSex() {
        super();
    }

    public Integer getSexId() {
        return sexId;
    }

    public void setSexId(Integer sexId) {
        this.sexId = sexId;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId == null ? null : eventId.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
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

    @Override
    public String toString() {
        return "PortraitSex{" +
                "sexId=" + sexId +
                ", eventId='" + eventId + '\'' +
                ", sex=" + sex +
                ", pro=" + pro +
                ", createTime=" + createTime +
                ", creator='" + creator + '\'' +
                ", updateTime=" + updateTime +
                ", updater='" + updater + '\'' +
                '}';
    }
}