package com.unicom.model;

import java.math.BigDecimal;
import java.util.Date;

public class PortraitPatternCopy {
    private BigDecimal weboNum;

    private String time;

    private Byte accountType;
    public PortraitPatternCopy( BigDecimal weboNum, String time, Byte accountType) {
        this.weboNum = weboNum;
        this.time = time;
        this.accountType = accountType;
    }

    public PortraitPatternCopy() {
        super();
    }

    public BigDecimal getWeboNum() {
        return weboNum;
    }

    public void setWeboNum(BigDecimal weboNum) {
        this.weboNum = weboNum;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Byte getAccountType() {
        return accountType;
    }

    public void setAccountType(Byte accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "PortraitPatternCopy{" +
                "weboNum=" + weboNum +
                ", time='" + time + '\'' +
                ", accountType=" + accountType +
                '}';
    }
}