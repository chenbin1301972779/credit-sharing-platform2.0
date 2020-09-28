package com.fanruan.platform.mapper;

import com.fanruan.platform.bean.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * <p></p>
 *
 * @author DELk
 * @@version 1.0.0
 * @since 2020/9/29
 */
@Repository
public interface UsersMapper {
    public List<User> getSubUserList(HashMap<String, Object> hs, Integer pageIndex,
                                     Integer pageSize,
                                     String username,
                                     String name,
                                     Integer status,
                                     Integer isSubAdmin,
                                     String operator);
    public Integer getSubUserListCount(Integer pageIndex,
                                       Integer pageSize,
                                       String username,
                                       String name,
                                       Integer status,
                                       Integer isSubAdmin,
                                       String operator);
}
