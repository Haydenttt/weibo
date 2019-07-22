package com.unicom.model;

import java.math.BigDecimal;
import java.util.Date;

public class IndexMonthEventDetail {
    private Integer id;

    private Integer eventId;

    private String title;

    private String firstType;

    private BigDecimal inf;

    private BigDecimal typePro;

    private BigDecimal allPro;

    private Integer sevenDayInf;

    private String sevenDayTime;

    private String sevenDayStart;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updater;

    public IndexMonthEventDetail(Integer id, Integer eventId, String title, String firstType, BigDecimal inf, BigDecimal typePro, BigDecimal allPro, Integer sevenDayInf, String sevenDayTime, String sevenDayStart, Date createTime, String creator, Date updateTime, String updater) {
        this.id = id;
        this.eventId = eventId;
        this.title = title;
        this.firstType = firstType;
        this.inf = inf;
        this.typePro = typePro;
        this.allPro = allPro;
        this.sevenDayInf = sevenDayInf;
        this.sevenDayTime = sevenDayTime;
        this.sevenDayStart = sevenDayStart;
        this.createTime = createTime;
        this.creator = creator;
        this.updateTime = updateTime;
        this.updater = updater;
    }

    public IndexMonthEventDetail() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getFirstType() {
        return firstType;
    }

    public void setFirstType(String firstType) {
        this.firstType = firstType == null ? null : firstType.trim();
    }

    public BigDecimal getInf() {
        return inf;
    }

    public void setInf(BigDecimal inf) {
        this.inf = inf;
    }

    public BigDecimal getTypePro() {
        return typePro;
    }

    public void setTypePro(BigDecimal typePro) {
        this.typePro = typePro;
    }

    public BigDecimal getAllPro() {
        return allPro;
    }

    public void setAllPro(BigDecimal allPro) {
        this.allPro = allPro;
    }

    public Integer getSevenDayInf() {
        return sevenDayInf;
    }

    public void setSevenDayInf(Integer sevenDayInf) {
        this.sevenDayInf = sevenDayInf;
    }

    public String getSevenDayTime() {
        return sevenDayTime;
    }

    public void setSevenDayTime(String sevenDayTime) {
        this.sevenDayTime = sevenDayTime == null ? null : sevenDayTime.trim();
    }

    public String getSevenDayStart() {
        return sevenDayStart;
    }

    public void setSevenDayStart(String sevenDayStart) {
        this.sevenDayStart = sevenDayStart == null ? null : sevenDayStart.trim();
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