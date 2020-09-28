package com.fanruan.platform.dao;

import com.fanruan.platform.bean.UserPermission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserPermissionDao extends JpaRepository<UserPermission,Integer> {
    List<UserPermission> findAllByUserIdAndPermissionStatus(Integer userId,String status);
    List<UserPermission> findAllByUserIdInAndPermissionStatus(List<Integer> userIds,String status);
}
