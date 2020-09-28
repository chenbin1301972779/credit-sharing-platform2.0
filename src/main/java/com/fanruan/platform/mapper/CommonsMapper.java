package com.fanruan.platform.mapper;

import com.fanruan.platform.bean.BlackList;
import com.fanruan.platform.bean.UserCompany;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>TODO</p>
 *
 * @author DELk
 * @@version 1.0.0
 * @since 2020/9/28
 */
@Repository
public interface CommonsMapper {
    /**黑名单*/
    List<BlackList> getBlackList(String userCode);
    /**子管理员获取可选公司*/
    public List<UserCompany> getUserCompany(String username);
}
