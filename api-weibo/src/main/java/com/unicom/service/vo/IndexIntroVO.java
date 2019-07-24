package com.unicom.service.vo;

/**
 * @program: unicom-weibo
 * @description:
 * @author: Hayden TONG
 * @create: 2019-07-24 14:07
 **/
public class IndexIntroVO {

    private Integer dayHeatSum;

    private Byte dayHeatLevel;

    private String dayHeatStart;

    private String dayHeatEnd;

    private Integer dayHeatAvg;

    public Integer getDayHeatSum() {
        return dayHeatSum;
    }

    public void setDayHeatSum(Integer dayHeatSum) {
        this.dayHeatSum = dayHeatSum;
    }

    public String  getDayHeatLevel() {
        if (0 == dayHeatLevel) {
            return "低";
        }
        if (1 == dayHeatLevel) {
            return "中等";
        }
        if (2 == dayHeatLevel) {
            return "高";
        }
        if (3 == dayHeatLevel) {
            return "超低";
        }
        if (4 == dayHeatLevel) {
            return "超高";
        }
        return "undefined day heat level";
    }

    public void setDayHeatLevel(Byte dayHeatLevel) {
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
