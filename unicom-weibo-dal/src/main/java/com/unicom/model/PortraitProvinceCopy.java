package com.unicom.model;

import java.math.BigDecimal;
import java.util.Date;

public class PortraitProvinceCopy {
    private String province;
    private BigDecimal pro;
    public PortraitProvinceCopy(String province, BigDecimal pro) {
        this.province = province;
        this.pro = pro;
    }
    public PortraitProvinceCopy() {
        super();
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

    @Override
    public String toString() {
        return "PortraitProvinceCopy{" +
                "province='" + province + '\'' +
                ", pro=" + pro +
                '}';
    }
}