package com.unicom.service.vo;

import java.math.BigDecimal;

/**
 * @program: unicom-weibo
 * @description:
 * @author: Hayden TONG
 * @create: 2019-07-26 20:59
 **/
public class IndexMonthEventDetailVO {

    private String title;

    private String firstType;

    private BigDecimal inf;

    private BigDecimal typePro;

    private BigDecimal allPro;

    private Integer sevenDayInf;

    private String sevenDayTime;

//    private String sevenDayStart;

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
        this.sevenDayTime = sevenDayTime;
    }
}
