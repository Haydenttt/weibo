package com.unicom.model;

import java.math.BigDecimal;
import java.util.Date;

public class EventStats {
    private Integer id;

    private String eventId;

    private BigDecimal effectInf;

    private BigDecimal effectTypePro;

    private BigDecimal effectAllPro;

    private BigDecimal effectClassAvg;

    private BigDecimal weiboInf;

    private BigDecimal weiboTypePro;

    private BigDecimal weiboAllPro;

    private BigDecimal weiboClassAvg;

    private BigDecimal weixinInf;

    private BigDecimal weixinTypePro;

    private BigDecimal weixinAllPro;

    private BigDecimal weixinClassAvg;

    private BigDecimal mediaInf;

    private BigDecimal mediaTypePro;

    private BigDecimal mediaAllPro;

    private BigDecimal mediaClassAvg;

    private Integer mediaNum;

    private BigDecimal ccpMediaIn;

    private BigDecimal ccpTypePro;

    private BigDecimal ccpAllPro;

    private BigDecimal ccpClassAvg;

    private BigDecimal financeMediaIn;

    private BigDecimal financeTypePro;

    private BigDecimal financeAllPro;

    private BigDecimal financeClassAvg;

    private BigDecimal techMediaIn;

    private BigDecimal techTypePro;

    private BigDecimal techAllPro;

    private BigDecimal techClassAvg;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updater;

    public EventStats(Integer id, String eventId, BigDecimal effectInf, BigDecimal effectTypePro, BigDecimal effectAllPro, BigDecimal effectClassAvg, BigDecimal weiboInf, BigDecimal weiboTypePro, BigDecimal weiboAllPro, BigDecimal weiboClassAvg, BigDecimal weixinInf, BigDecimal weixinTypePro, BigDecimal weixinAllPro, BigDecimal weixinClassAvg, BigDecimal mediaInf, BigDecimal mediaTypePro, BigDecimal mediaAllPro, BigDecimal mediaClassAvg, Integer mediaNum, BigDecimal ccpMediaIn, BigDecimal ccpTypePro, BigDecimal ccpAllPro, BigDecimal ccpClassAvg, BigDecimal financeMediaIn, BigDecimal financeTypePro, BigDecimal financeAllPro, BigDecimal financeClassAvg, BigDecimal techMediaIn, BigDecimal techTypePro, BigDecimal techAllPro, BigDecimal techClassAvg, Date createTime, String creator, Date updateTime, String updater) {
        this.id = id;
        this.eventId = eventId;
        this.effectInf = effectInf;
        this.effectTypePro = effectTypePro;
        this.effectAllPro = effectAllPro;
        this.effectClassAvg = effectClassAvg;
        this.weiboInf = weiboInf;
        this.weiboTypePro = weiboTypePro;
        this.weiboAllPro = weiboAllPro;
        this.weiboClassAvg = weiboClassAvg;
        this.weixinInf = weixinInf;
        this.weixinTypePro = weixinTypePro;
        this.weixinAllPro = weixinAllPro;
        this.weixinClassAvg = weixinClassAvg;
        this.mediaInf = mediaInf;
        this.mediaTypePro = mediaTypePro;
        this.mediaAllPro = mediaAllPro;
        this.mediaClassAvg = mediaClassAvg;
        this.mediaNum = mediaNum;
        this.ccpMediaIn = ccpMediaIn;
        this.ccpTypePro = ccpTypePro;
        this.ccpAllPro = ccpAllPro;
        this.ccpClassAvg = ccpClassAvg;
        this.financeMediaIn = financeMediaIn;
        this.financeTypePro = financeTypePro;
        this.financeAllPro = financeAllPro;
        this.financeClassAvg = financeClassAvg;
        this.techMediaIn = techMediaIn;
        this.techTypePro = techTypePro;
        this.techAllPro = techAllPro;
        this.techClassAvg = techClassAvg;
        this.createTime = createTime;
        this.creator = creator;
        this.updateTime = updateTime;
        this.updater = updater;
    }

    public EventStats() {
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

    public BigDecimal getEffectInf() {
        return effectInf;
    }

    public void setEffectInf(BigDecimal effectInf) {
        this.effectInf = effectInf;
    }

    public BigDecimal getEffectTypePro() {
        return effectTypePro;
    }

    public void setEffectTypePro(BigDecimal effectTypePro) {
        this.effectTypePro = effectTypePro;
    }

    public BigDecimal getEffectAllPro() {
        return effectAllPro;
    }

    public void setEffectAllPro(BigDecimal effectAllPro) {
        this.effectAllPro = effectAllPro;
    }

    public BigDecimal getEffectClassAvg() {
        return effectClassAvg;
    }

    public void setEffectClassAvg(BigDecimal effectClassAvg) {
        this.effectClassAvg = effectClassAvg;
    }

    public BigDecimal getWeiboInf() {
        return weiboInf;
    }

    public void setWeiboInf(BigDecimal weiboInf) {
        this.weiboInf = weiboInf;
    }

    public BigDecimal getWeiboTypePro() {
        return weiboTypePro;
    }

    public void setWeiboTypePro(BigDecimal weiboTypePro) {
        this.weiboTypePro = weiboTypePro;
    }

    public BigDecimal getWeiboAllPro() {
        return weiboAllPro;
    }

    public void setWeiboAllPro(BigDecimal weiboAllPro) {
        this.weiboAllPro = weiboAllPro;
    }

    public BigDecimal getWeiboClassAvg() {
        return weiboClassAvg;
    }

    public void setWeiboClassAvg(BigDecimal weiboClassAvg) {
        this.weiboClassAvg = weiboClassAvg;
    }

    public BigDecimal getWeixinInf() {
        return weixinInf;
    }

    public void setWeixinInf(BigDecimal weixinInf) {
        this.weixinInf = weixinInf;
    }

    public BigDecimal getWeixinTypePro() {
        return weixinTypePro;
    }

    public void setWeixinTypePro(BigDecimal weixinTypePro) {
        this.weixinTypePro = weixinTypePro;
    }

    public BigDecimal getWeixinAllPro() {
        return weixinAllPro;
    }

    public void setWeixinAllPro(BigDecimal weixinAllPro) {
        this.weixinAllPro = weixinAllPro;
    }

    public BigDecimal getWeixinClassAvg() {
        return weixinClassAvg;
    }

    public void setWeixinClassAvg(BigDecimal weixinClassAvg) {
        this.weixinClassAvg = weixinClassAvg;
    }

    public BigDecimal getMediaInf() {
        return mediaInf;
    }

    public void setMediaInf(BigDecimal mediaInf) {
        this.mediaInf = mediaInf;
    }

    public BigDecimal getMediaTypePro() {
        return mediaTypePro;
    }

    public void setMediaTypePro(BigDecimal mediaTypePro) {
        this.mediaTypePro = mediaTypePro;
    }

    public BigDecimal getMediaAllPro() {
        return mediaAllPro;
    }

    public void setMediaAllPro(BigDecimal mediaAllPro) {
        this.mediaAllPro = mediaAllPro;
    }

    public BigDecimal getMediaClassAvg() {
        return mediaClassAvg;
    }

    public void setMediaClassAvg(BigDecimal mediaClassAvg) {
        this.mediaClassAvg = mediaClassAvg;
    }

    public Integer getMediaNum() {
        return mediaNum;
    }

    public void setMediaNum(Integer mediaNum) {
        this.mediaNum = mediaNum;
    }

    public BigDecimal getCcpMediaIn() {
        return ccpMediaIn;
    }

    public void setCcpMediaIn(BigDecimal ccpMediaIn) {
        this.ccpMediaIn = ccpMediaIn;
    }

    public BigDecimal getCcpTypePro() {
        return ccpTypePro;
    }

    public void setCcpTypePro(BigDecimal ccpTypePro) {
        this.ccpTypePro = ccpTypePro;
    }

    public BigDecimal getCcpAllPro() {
        return ccpAllPro;
    }

    public void setCcpAllPro(BigDecimal ccpAllPro) {
        this.ccpAllPro = ccpAllPro;
    }

    public BigDecimal getCcpClassAvg() {
        return ccpClassAvg;
    }

    public void setCcpClassAvg(BigDecimal ccpClassAvg) {
        this.ccpClassAvg = ccpClassAvg;
    }

    public BigDecimal getFinanceMediaIn() {
        return financeMediaIn;
    }

    public void setFinanceMediaIn(BigDecimal financeMediaIn) {
        this.financeMediaIn = financeMediaIn;
    }

    public BigDecimal getFinanceTypePro() {
        return financeTypePro;
    }

    public void setFinanceTypePro(BigDecimal financeTypePro) {
        this.financeTypePro = financeTypePro;
    }

    public BigDecimal getFinanceAllPro() {
        return financeAllPro;
    }

    public void setFinanceAllPro(BigDecimal financeAllPro) {
        this.financeAllPro = financeAllPro;
    }

    public BigDecimal getFinanceClassAvg() {
        return financeClassAvg;
    }

    public void setFinanceClassAvg(BigDecimal financeClassAvg) {
        this.financeClassAvg = financeClassAvg;
    }

    public BigDecimal getTechMediaIn() {
        return techMediaIn;
    }

    public void setTechMediaIn(BigDecimal techMediaIn) {
        this.techMediaIn = techMediaIn;
    }

    public BigDecimal getTechTypePro() {
        return techTypePro;
    }

    public void setTechTypePro(BigDecimal techTypePro) {
        this.techTypePro = techTypePro;
    }

    public BigDecimal getTechAllPro() {
        return techAllPro;
    }

    public void setTechAllPro(BigDecimal techAllPro) {
        this.techAllPro = techAllPro;
    }

    public BigDecimal getTechClassAvg() {
        return techClassAvg;
    }

    public void setTechClassAvg(BigDecimal techClassAvg) {
        this.techClassAvg = techClassAvg;
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
        return "EventStats{" +
                "id=" + id +
                ", eventId='" + eventId + '\'' +
                ", effectInf=" + effectInf +
                ", effectTypePro=" + effectTypePro +
                ", effectAllPro=" + effectAllPro +
                ", effectClassAvg=" + effectClassAvg +
                ", weiboInf=" + weiboInf +
                ", weiboTypePro=" + weiboTypePro +
                ", weiboAllPro=" + weiboAllPro +
                ", weiboClassAvg=" + weiboClassAvg +
                ", weixinInf=" + weixinInf +
                ", weixinTypePro=" + weixinTypePro +
                ", weixinAllPro=" + weixinAllPro +
                ", weixinClassAvg=" + weixinClassAvg +
                ", mediaInf=" + mediaInf +
                ", mediaTypePro=" + mediaTypePro +
                ", mediaAllPro=" + mediaAllPro +
                ", mediaClassAvg=" + mediaClassAvg +
                ", mediaNum=" + mediaNum +
                ", ccpMediaIn=" + ccpMediaIn +
                ", ccpTypePro=" + ccpTypePro +
                ", ccpAllPro=" + ccpAllPro +
                ", ccpClassAvg=" + ccpClassAvg +
                ", financeMediaIn=" + financeMediaIn +
                ", financeTypePro=" + financeTypePro +
                ", financeAllPro=" + financeAllPro +
                ", financeClassAvg=" + financeClassAvg +
                ", techMediaIn=" + techMediaIn +
                ", techTypePro=" + techTypePro +
                ", techAllPro=" + techAllPro +
                ", techClassAvg=" + techClassAvg +
                ", createTime=" + createTime +
                ", creator='" + creator + '\'' +
                ", updateTime=" + updateTime +
                ", updater='" + updater + '\'' +
                '}';
    }
}