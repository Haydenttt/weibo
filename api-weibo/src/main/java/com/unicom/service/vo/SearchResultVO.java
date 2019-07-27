package com.unicom.service.vo;

import java.math.BigDecimal;
import java.util.Date;

public class SearchResultVO {

    private String eventId;

    private String title;

    private String imgUrl;

    private String firstType;

    private BigDecimal infExponent;

    private String media;

    private String startTime;

    private String descript;

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getFirstType() {
        return firstType;
    }

    public void setFirstType(String firstType) {
        this.firstType = firstType;
    }

    public BigDecimal getInfExponent() {
        return infExponent;
    }

    public void setInfExponent(BigDecimal infExponent) {
        this.infExponent = infExponent;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }
}