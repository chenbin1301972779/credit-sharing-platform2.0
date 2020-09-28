package com.fanruan.platform.constant;

import com.fanruan.platform.bean.BlackPush;
import com.fanruan.platform.bean.Company;
import com.fanruan.platform.bean.NewCompany;
import com.fanruan.platform.bean.User;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.util.*;

public class CommonUtils {

    public static Integer getIntegerValue(Object obj) {
        if(obj == null ){
            return null;
        }
        if(obj instanceof Integer){
            return (Integer)obj;
        }else {
            if(StringUtils.isBlank(String.valueOf(obj))){
                return null;
            }
            return Integer.valueOf(String.valueOf(obj));
        }
    }
    public static String getRandomCode() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-", "").substring(0, 16);
    }
    public static User getUserValue(Optional<User> optional) {
        if(optional!=null&&optional.isPresent()){
            return optional.get();
        }else {
            return null;
        }
    }

    public static NewCompany getNewCompanyValue(Optional<NewCompany> optional) {
        if(optional!=null&&optional.isPresent()){
            return optional.get();
        }else {
            return null;
        }
    }


    public static Company getCompanyValue(Optional<Company> optional) {
        if(optional.isPresent()){
            return optional.get();
        }else {
            return null;
        }
    }


    public static List<String> getCreditCode(List<Company> companyList) {
        List<String> list = Lists.newArrayList();
        for(Company company:companyList){
            list.add(company.getCreditCode());
        }
        return list;
    }

    public static String getLastYear() {
        Date date = DateUtils.addYears(new Date(), -1);
        return  DateFormatUtils.format(date, "yyyy");
    }
    public static String getLastSecondYear() {
        Date date = DateUtils.addYears(new Date(), -2);
        return  DateFormatUtils.format(date, "yyyy");
    }

    public static String getLastThirdYear() {
        Date date = DateUtils.addYears(new Date(), -3);
        return  DateFormatUtils.format(date, "yyyy");
    }

    public static List<String> getUserNames(List<BlackPush> blackPushList) {
        List<String> userIds = Lists.newLinkedList();
        for(BlackPush blackPush :blackPushList){
            if(StringUtils.isNotBlank(blackPush.getUserName())){
                userIds.add(blackPush.getUserName());
            }
        }
        return userIds;
    }

    public static Map<String, String> getUserIds(List<User> userList) {
        Map<String,String> map = Maps.newHashMap();
        for(User user:userList){
            map.put(user.getUsername(),String.valueOf(user.getUserId()));
        }
        return map;
    }

    public static List<String> getCompanyName(List<Company> companys) {
        List<String> list = Lists.newArrayList();
        for(Company company:companys){
            list.add(company.getCompanyName());
        }
        return list;
    }
}
