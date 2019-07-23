package com.unicom.exception;

/**
 * 自定义异常
 *
 * @Author: XuJianHua
 * @Date: 2019/1/4 14:52
 */
public class UnicomWeiboException extends RuntimeException {

    private static final long serialVersionUID = -2937496509853639266L;

    /**
     * 异常状态
     */
    private Integer status;

    /**
     * 异常消息
     */
    private String emsg;

    public UnicomWeiboException(String emsg){
        super(emsg);
        this.status = 99;
        this.emsg = emsg;
    }

    public UnicomWeiboException(Integer status, String emsg) {
        super(emsg);
        this.status = status;
        this.emsg = emsg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEmsg() {
        return emsg;
    }

    public void setEmsg(String emsg) {
        this.emsg = emsg;
    }
}