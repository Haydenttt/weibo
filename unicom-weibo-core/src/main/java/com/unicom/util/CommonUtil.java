package com.unicom.util;

import com.unicom.exception.BusinessException;
import com.unicom.exception.EmBusinessError;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

//字符串比较，相同返回true
public class CommonUtil {
    public static Boolean compareString(String sourceStr, String targetStr) {
        //字符串都是空，返回true
        if (isStringEmpty(sourceStr) && isStringEmpty(targetStr)) {
            return true;
        } else {
            if (null != sourceStr && null != targetStr && sourceStr.equals(targetStr)) {
                return true;

            }
        }
        return false;
    }

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

    public static Date fixDatawithNull(Date date) {
        if (null != date) {
            Date dateTemp = new Date(0);
            if (dateTemp.equals(date)) {
                return null;
            }
        }
        return date;
    }

    public static String getSysYear() {
        Calendar date = Calendar.getInstance();
        String year = String.valueOf(date.get(Calendar.YEAR));
        return year;
    }

    public static Boolean isParameterEmpty(Map<String, Object> map, String[] params) {
        for (String param : params) {
            String str = getStringFromMap(map, param);
            if (isStringEmpty(str)) {
                return true;
            }
        }
        return false;
    }

    //单个参数判空
    public static Boolean isSingleParameterEmpty(Map<String, Object> map, String param) {
        String str = getStringFromMap(map, param);
        if (isStringEmpty(str)) {
            return true;
        }
        return false;
    }

    public static Boolean isStringEmpty(String str) {
        if (null == str) {
            return true;
        }
        return "".equals(str);
    }

    //    将Date格式时间转为String"XXXX年XX月XX日"
    public static String formatDate(Date inTime) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String time;
        String time2 = String.valueOf(inTime);
        if (time2 == null || time2.equals("") || time2 == "null" || time2.equals(" ")) {
            try {
                inTime = simpleDateFormat.parse("2000-01-01");
            } catch (Exception e) {
                e.printStackTrace();
                throw new BusinessException(EmBusinessError.UNKNOW_ERROR.setErrMsg("日期获取or转换失败"));
            }
        }
        try {
            time = simpleDateFormat.format(inTime);
//        若查询到默认时间，则转为""
            if (time.equals("2000-01-01")) {
                time = "";
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException(EmBusinessError.UNKNOW_ERROR.setErrMsg("日期获取or转换失败"));
        }
        return time;
    }

    //    将Date格式时间转为String"XXXX年XX月XX日 00:00:00"
    public static String formatDateForView(Date inTime) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String time;
        String time2 = String.valueOf(inTime);
        if (time2 == null || time2.equals("") || time2 == "null" || time2.equals(" ")){
            try{
                inTime=simpleDateFormat.parse("2000-01-01");
            }catch (Exception e) {
                e.printStackTrace();
                throw new BusinessException(EmBusinessError.UNKNOW_ERROR.setErrMsg("日期获取or转换失败"));
            }
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        try {
            time = simpleDateFormat.format(inTime);
//        若查询到默认时间，则转为""
            if (time.equals("2000-01-01")){
                time = "";
            }else{
                time = sdf.format(inTime);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException(EmBusinessError.UNKNOW_ERROR.setErrMsg("日期获取or转换失败"));
        }
        return time;
    }
}
