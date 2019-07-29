package com.unicom.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: lp
 * @Date: 2019/7/25 15:54
 * @Version 1.0
 */
public class DateUtil {

    //日期模板
    public static final String DATE_PATTERN = "yyyy-MM-dd";
    //带小时模板
    public static final String HOUR_PATTERN = "yyyy-MM-dd HH";
    //每天毫秒数
    public static final int ONE_DAY_TIME = 24 * 60 * 60 * 1000;
    //每小时毫秒数
    public static final int ONE_HOUR_TIME = 60 * 60 * 1000;

    /**
     * 根据时间点计算前后n单位时间数组
     *
     * @param timePoint 初始时间点
     * @param n         时间点前后单位时间数（正表示向后n个，负表示向前n个）
     * @param pattern   时间模板
     * @param timeUnit  单位时间毫秒数
     * @return
     * @throws ParseException
     */
    public static String[] getCalculateDay(Object timePoint, int n, String pattern, int timeUnit) throws ParseException {
        int num = Math.abs(n);
        String[] calculateDayArray = new String[num];
        String calculateTime = "";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        //初始化时间点
        Date initDate;
        if (null == timePoint) {
            initDate = new Date();
        } else if (timePoint instanceof Date) {
            initDate = (Date) timePoint;
        } else {
            initDate = simpleDateFormat.parse((String) timePoint);
        }

        Long initMilliSeconds = initDate.getTime();
        int sign = n > 0 ? 1 : -1;
        for (int i = 0; i < num; i++) {
            initMilliSeconds += timeUnit * sign;
            Date calculateDate = new Date(initMilliSeconds);
            calculateDayArray[i] = simpleDateFormat.format(calculateDate);
        }
        return calculateDayArray;
    }

    /**
     * 把毫秒数转为时长
     *
     * @param millisecond
     * @return
     */
    public static String periodToString(Long millisecond) {
        String str = "";
//        long day = millisecond / 86400000;
//        long hour = (millisecond % 86400000) / 3600000 ;
        long hour = millisecond / 3600000;
//        long minute = (millisecond % 86400000 % 3600000) / 60000;
//        if(day > 0){
////            str = day + "天";
////        }
        if (hour > 0) {
            str += hour;
        }
//        if(minute > 0){
//            str += minute + "分钟";
//        }
        return str;
    }

}
