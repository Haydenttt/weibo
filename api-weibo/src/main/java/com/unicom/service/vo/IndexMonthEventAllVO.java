package com.unicom.service.vo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @program: unicom-weibo
 * @description:
 * @author: Hayden TONG
 * @create: 2019-07-26 14:46
 **/
public class IndexMonthEventAllVO {

    private String title;

    private String firstType;

    private Date startTime;

    private BigDecimal infExponent;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstType() {
        return firstType;
    }

    public void setFirstType(String firstType) {
        this.firstType = firstType;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public BigDecimal getInfExponent() {
        return infExponent;
    }

    public void setInfExponent(BigDecimal infExponent) {
        this.infExponent = infExponent;
    }

    public IndexMonthEventAllVO() {
    }

    public IndexMonthEventAllVO(String title, String firstType, Date startTime, BigDecimal infExponent) {
        this.title = title;
        this.firstType = firstType;
        this.startTime = startTime;
        this.infExponent = infExponent;
    }
}
