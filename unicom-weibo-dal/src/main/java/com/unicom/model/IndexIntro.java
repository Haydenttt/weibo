package com.unicom.model;

import java.util.Date;

public class IndexIntro {
    private Integer id;

    private Integer dayHeatSum;

    private String dayHeatLevel;

    private String dayHeatStart;

    private String dayHeatEnd;

    private Integer dayHeatAvg;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updater;

    public IndexIntro(Integer id, Integer dayHeatSum, String dayHeatLevel, String dayHeatStart, String dayHeatEnd, Integer dayHeatAvg, Date createTime, String creator, Date updateTime, String updater) {
        this.id = id;
        this.dayHeatSum = dayHeatSum;
        this.dayHeatLevel = dayHeatLevel;
        this.dayHeatStart = dayHeatStart;
        this.dayHeatEnd = dayHeatEnd;
        this.dayHeatAvg = dayHeatAvg;
        this.createTime = createTime;
        this.creator = creator;
        this.updateTime = updateTime;
        this.updater = updater;
    }

    public IndexIntro() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDayHeatSum() {
        return dayHeatSum;
    }

    public void setDayHeatSum(Integer dayHeatSum) {
        this.dayHeatSum = dayHeatSum;
    }

    public String getDayHeatLevel() {
        return dayHeatLevel;
    }

    public void setDayHeatLevel(String dayHeatLevel) {
        this.dayHeatLevel = dayHeatLevel == null ? null : dayHeatLevel.trim();
    }

    public String getDayHeatStart() {
        return dayHeatStart;
    }

    public void setDayHeatStart(String dayHeatStart) {
        this.dayHeatStart = dayHeatStart == null ? null : dayHeatStart.trim();
    }

    public String getDayHeatEnd() {
        return dayHeatEnd;
    }

    public void setDayHeatEnd(String dayHeatEnd) {
        this.dayHeatEnd = dayHeatEnd == null ? null : dayHeatEnd.trim();
    }

    public Integer getDayHeatAvg() {
        return dayHeatAvg;
    }

    public void setDayHeatAvg(Integer dayHeatAvg) {
        this.dayHeatAvg = dayHeatAvg;
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