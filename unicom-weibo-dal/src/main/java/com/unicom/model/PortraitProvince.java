package com.unicom.model;

import java.math.BigDecimal;
import java.util.Date;

public class PortraitProvince {
    private Integer provinceId;

    private String eventId;

    private String province;

    private BigDecimal pro;

    private Date createTime;

    private String creator;

    private Date update;

    private String updater;

    public PortraitProvince(Integer provinceId, String eventId, String province, BigDecimal pro, Date createTime, String creator, Date update, String updater) {
        this.provinceId = provinceId;
        this.eventId = eventId;
        this.province = province;
        this.pro = pro;
        this.createTime = createTime;
        this.creator = creator;
        this.update = update;
        this.updater = updater;
    }

    public PortraitProvince() {
        super();
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId == null ? null : eventId.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
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

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }
}