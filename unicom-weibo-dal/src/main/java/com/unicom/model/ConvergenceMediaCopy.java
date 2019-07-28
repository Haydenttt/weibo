package com.unicom.model;

import java.util.Date;

public class ConvergenceMediaCopy {
    private String title;
    private Integer mediaNum;
    private String media;
    public ConvergenceMediaCopy(String title, Integer mediaNum, String media) {
        this.title = title;
        this.mediaNum = mediaNum;
        this.media = media;
    }

    public ConvergenceMediaCopy() {
        super();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getMediaNum() {
        return mediaNum;
    }

    public void setMediaNum(Integer mediaNum) {
        this.mediaNum = mediaNum;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media == null ? null : media.trim();
    }

    @Override
    public String toString() {
        return "ConvergenceMediaCopy{" +
                "title='" + title + '\'' +
                ", mediaNum=" + mediaNum +
                ", media='" + media + '\'' +
                '}';
    }
}