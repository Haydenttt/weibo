package com.unicom.util;

import com.unicom.exception.WeiboException;
import com.unicom.exception.EmWeiboError;

import java.text.SimpleDateFormat;
import java.util.*;

public class CommonUtil {

    public static String getStringFromMap(Map<String, Object> map, String parameter) {
        if (null == map || CommonUtil.isStringEmpty(parameter)) {
            return "";
        } else {
            Object object = map.get(parameter);
            if (null == object) {
                return "";
            } else {
                return (String) object;
            }
        }

    }

    public static Boolean isStringEmpty(String str) {
        if (null == str) {
            return true;
        }
        return "".equals(str);
    }

    public static Date milliSecondToDate(Long milliSecond) {
        Date date = new Date();
        date.setTime(milliSecond);
        return date;
    }

}
