package com.unicom.util;


/**
 * 异常工具类
 *
 * @author
 */
public class ExceptionUtil {

    /**
     * 获取异常信息
     *
     * @param e
     * @return
     */
	public static String getMessage(Exception e) {
        String message = e.getMessage();
        if(null == message) {
        	message = "Null Pointer Exception";
        }
        return message;
    }
}