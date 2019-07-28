package com.unicom.model;

import java.math.BigDecimal;
import java.util.Date;

public class PortraitSexCopy {

    private Byte sex;

    private BigDecimal pro;

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public BigDecimal getPro() {
        return pro;
    }

    public void setPro(BigDecimal pro) {
        this.pro = pro;
    }


    @Override
    public String toString() {
        return "PortraitSex{" +
                ", sex=" + sex +
                ", pro=" + pro +

                '}';
    }
}