package com.unicom.http;

import com.unicom.util.JsonUtil;

import java.io.Serializable;

/**
 * 统一返回的model
 *
 * @author
 */
public class ApiResult implements Serializable {

    private static final long serialVersionUID = 313112098858090298L;

    /**
     * 返回错误码,1表示正确,0表示错误
     */
    private static final Integer SUCCESS_STATUS = 1;
    private static final Integer ERROR_STATUS = 0;

    /**
     * 返回错误码,1表示正确,0表示错误
     */
    private int status;

    /**
     * 错误信息
     */
    private String message;

    /**
     * 返回的数据
     */
    private Object data;

    public static ApiResult success() {
        return new ApiResult(SUCCESS_STATUS, "操作成功", null);
    }

    public static ApiResult error() {
        return new ApiResult(ERROR_STATUS, null, null);
    }

    public ApiResult(Object data) {
        this(SUCCESS_STATUS, "操作成功", data);
    }

    public ApiResult(int status, String message) {
        this(status, message, null);
    }

    public ApiResult(String message, Object data) {
        this(SUCCESS_STATUS, message, data);
    }

    public ApiResult(int status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    /**
     * 默认操作成功,不返回数据,只返回操作成功提示
     */
    public ApiResult() {
        this(1, "success", null);
    }

    /**
     * build message
     *
     * @param message
     * @return this
     */
    public ApiResult message(String message) {
        this.setMessage(message);
        return this;
    }

    /**
     * build status
     *
     * @param status
     * @return this
     */
    public ApiResult status(int status) {
        this.setStatus(status);
        return this;
    }

    /**
     * build data
     *
     * @param data
     * @return this
     */
    public ApiResult data(Object data) {
        this.setData(data);
        return this;
    }

    /**
     * 转换成Json字符串
     *
     * @return
     */
    public String toJson() {
        return JsonUtil.EXCLUDE_EMPTY.toJson(this);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ApiResult [status=" + status + ", message=" + message + ", data=" + data + "]";
    }

}