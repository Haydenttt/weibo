package com.unicom.model;

import java.math.BigDecimal;
import java.util.Date;

public class PortraitActivityCopy {
    private String title;
    private Byte activity;
    private BigDecimal pro;
    public PortraitActivityCopy(String title, Byte activity, BigDecimal pro) {
        this.title = title;
        this.activity = activity;
        this.pro = pro;
    }
    public PortraitActivityCopy() {
        super();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Byte getActivity() {
        return activity;
    }

    public void setActivity(Byte activity) {
        this.activity = activity;
    }

    public BigDecimal getPro() {
        return pro;
    }

    public void setPro(BigDecimal pro) {
        this.pro = pro;
    }

    @Override
    public String toString() {
        return "PortraitActivityCopy{" +
                "title='" + title + '\'' +
                ", activity=" + activity +
                ", pro=" + pro +
                '}';
    }
}