package com.fanruan.platform.util;

import org.apache.commons.lang3.StringUtils;

public class StringUtil {
    public static String getOrginName(String name) {
        if(StringUtils.isNotBlank(name)){
            return name.replace("<em>","").replace("</em>","");
        }
        return null;
    }
}
