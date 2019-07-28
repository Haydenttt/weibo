package com.unicom.model;

import java.util.Date;

public class PortraitTagsCopy {

    private String tag;

    private Integer num;
    public PortraitTagsCopy(String tag, Integer num) {
        this.tag = tag;
        this.num = num;
    }

    public PortraitTagsCopy() {
        super();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "PortraitTagsCopy{" +
                "tag='" + tag + '\'' +
                ", num=" + num +
                '}';
    }
}