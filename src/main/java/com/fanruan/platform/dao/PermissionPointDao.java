package com.fanruan.platform.dao;

import com.fanruan.platform.bean.PermissionPoint;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PermissionPointDao extends JpaRepository<PermissionPoint,Integer> {

    List<PermissionPoint> findAllByPermissionRole(String permissionRole);
    Optional<PermissionPoint> findByPermissionPoint(String permissionPoint);
    Optional<PermissionPoint> findAllById(Integer id);
    List<PermissionPoint> findAll();
    List<PermissionPoint> findAllByPermissionRoleIn(List<String> permissionRoleList);
}
