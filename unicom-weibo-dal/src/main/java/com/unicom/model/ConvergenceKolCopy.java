package com.unicom.model;

import java.util.Date;

public class ConvergenceKolCopy {
    private String username;//微博主账号名
    private Integer fans;//粉丝数
    private String avatar;//微博主头像URL
    private String weboText;//微博内容
    private String weiboTime;//微博发布时间
    private Integer weiboNum;//参与次数

    public ConvergenceKolCopy(String username, Integer fans, Integer weiboNum,String avatar, String weboText, Byte ifForward, String weiboTime) {
        this.username = username;
        this.fans = fans;
        this.avatar = avatar;
        this.weboText = weboText;
        this.weiboTime = weiboTime;
        this.weiboNum = weiboNum;
    }
    public ConvergenceKolCopy() {
        super();
    }

    public Integer getWeiboNum() {
        return weiboNum;
    }

    public void setWeiboNum(Integer weiboNum) {
        this.weiboNum = weiboNum;
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

    public String getWeiboTime() {
        return weiboTime;
    }

    public void setWeiboTime(String weiboTime) {
        this.weiboTime = weiboTime == null ? null : weiboTime.trim();
    }

    @Override
    public String toString() {
        return "ConvergenceKolCopy{" +
                "username='" + username + '\'' +
                ", fans=" + fans +
                ", avatar='" + avatar + '\'' +
                ", weboText='" + weboText + '\'' +
                ", weiboTime='" + weiboTime + '\'' +
                ", weiboNum=" + weiboNum +
                '}';
    }
}