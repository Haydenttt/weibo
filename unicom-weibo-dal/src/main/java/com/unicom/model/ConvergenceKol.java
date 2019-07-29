package com.unicom.model;

import java.util.Date;

public class ConvergenceKol {
    private Integer kolId;

    private String eventId;

    private String username;

    private Integer fans;
    private Integer weiboNum;
    private String avatar;

    private String weboText;

    private Byte ifForward;

    private String weiboTime;

    private String url;

    private Byte sex;

    private String rootWeibo;

    private Byte vType;

    private Date createTime;

    private String creator;

    private Date updateTime;

    private String updater;

    public ConvergenceKol(Integer kolId, String eventId, String username, Integer fans,Integer weiboNum, String avatar, String weboText, Byte ifForward, String weiboTime, String url, Byte sex, String rootWeibo, Byte vType, Date createTime, String creator, Date updateTime, String updater) {
        this.kolId = kolId;
        this.eventId = eventId;
        this.username = username;
        this.fans = fans;
        this.avatar = avatar;
        this.weboText = weboText;
        this.ifForward = ifForward;
        this.weiboTime = weiboTime;
        this.url = url;
        this.sex = sex;
        this.rootWeibo = rootWeibo;
        this.vType = vType;
        this.createTime = createTime;
        this.creator = creator;
        this.updateTime = updateTime;
        this.updater = updater;
        this.weiboNum = weiboNum;
    }

    public ConvergenceKol() {
        super();
    }

    public Integer getWeiboNum() {
        return weiboNum;
    }

    public void setWeiboNum(Integer weiboNum) {
        this.weiboNum = weiboNum;
    }

    public Integer getKolId() {
        return kolId;
    }

    public void setKolId(Integer kolId) {
        this.kolId = kolId;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId == null ? null : eventId.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getFans() {
        return fans;
    }

    public void setFans(Integer fans) {
        this.fans = fans;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getWeboText() {
        return weboText;
    }

    public void setWeboText(String weboText) {
        this.weboText = weboText == null ? null : weboText.trim();
    }

    public Byte getIfForward() {
        return ifForward;
    }

    public void setIfForward(Byte ifForward) {
        this.ifForward = ifForward;
    }

    public String getWeiboTime() {
        return weiboTime;
    }

    public void setWeiboTime(String weiboTime) {
        this.weiboTime = weiboTime == null ? null : weiboTime.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getRootWeibo() {
        return rootWeibo;
    }

    public void setRootWeibo(String rootWeibo) {
        this.rootWeibo = rootWeibo == null ? null : rootWeibo.trim();
    }

    public Byte getvType() {
        return vType;
    }

    public void setvType(Byte vType) {
        this.vType = vType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }
}