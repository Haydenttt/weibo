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

    private String startTime;

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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
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

    @Override
    public String toString() {
        return "IndexMonthEventAllVO{" +
                "title='" + title + '\'' +
                ", firstType='" + firstType + '\'' +
                ", startTime=" + startTime +
                ", infExponent=" + infExponent +
                '}';
    }

    public IndexMonthEventAllVO(String title, String firstType, String startTime, BigDecimal infExponent) {
        this.title = title;
        this.firstType = firstType;
        this.startTime = startTime;
        this.infExponent = infExponent;
    }
}
