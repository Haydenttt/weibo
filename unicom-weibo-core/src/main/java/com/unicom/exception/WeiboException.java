package com.unicom.exception;

public class WeiboException extends RuntimeException implements CommonError {

    private CommonError commonError;

    public WeiboException(CommonError commonError) {
        super();
        this.commonError = commonError;
    }


    public WeiboException(CommonError commonError, String errMsg) {
        super();
        this.commonError = commonError;
        this.commonError.setErrMsg(errMsg);
    }


    @Override
    public int getErrCode() {
        return this.commonError.getErrCode();
    }

    @Override
    public String getErrMsg() {
        return this.commonError.getErrMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
        return this;
    }
}
