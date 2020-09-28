package com.fanruan.platform.util;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.util.Date;

public class DateUtil {

    public static String transform(String dateStr){
//        String str = "1997-06-18T00:00:00.000Z";
        String str = dateStr.replace("Z"," UTC");
        Date date = null;
        try {
            date = DateUtils.parseDate(str, "yyyy-MM-dd'T'HH:mm:ss.SSS Z");
            return DateFormatUtils.format(date, "yyyy-MM-dd HH:mm:ss");
        } catch (ParseException e) {
            e.printStackTrace();
        }
     return null;
    }

    public static String formatDate(String dateStr){
        return dateStr.split("\\.")[0];
    }
}
