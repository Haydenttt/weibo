package com.unicom.service.vo;

/**
 * @program: unicom-weibo
 * @description:
 * @author: Hayden TONG
 * @create: 2019-07-24 14:07
 **/
public class IndexIntroVO {

    private Integer dayHeatSum;

    private String dayHeatLevel;

    private String dayHeatStart;

    private String dayHeatEnd;

    private Integer dayHeatAvg;

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
        this.dayHeatLevel = dayHeatLevel;
    }

    public String getDayHeatStart() {
        return dayHeatStart;
    }

    public void setDayHeatStart(String dayHeatStart) {
        this.dayHeatStart = dayHeatStart;
    }

    public String getDayHeatEnd() {
        return dayHeatEnd;
    }

    public void setDayHeatEnd(String dayHeatEnd) {
        this.dayHeatEnd = dayHeatEnd;
    }

    public Integer getDayHeatAvg() {
        return dayHeatAvg;
    }

    public void setDayHeatAvg(Integer dayHeatAvg) {
        this.dayHeatAvg = dayHeatAvg;
    }
}
