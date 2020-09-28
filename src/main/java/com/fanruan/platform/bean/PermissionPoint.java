package com.fanruan.platform.bean;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 权限点标识和级别之间映射关系
 */
@Data
@Entity
@Table(name = "credit_permissoion_point")
public class PermissionPoint {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "permission_seq")
    @SequenceGenerator(name = "permission_seq", initialValue = 1, allocationSize = 1, sequenceName = "PERMISSION_SEQUENCE")
    private Integer id;
    /**
     * 角色
     */
    @Column(name="permission_role")
    private String permissionRole;

    @Column(name="permission_role_name")
    private String permissionRoleName;
    /**
     * 权限点
     */
    @Column(name="permission_point")
    private String permissionPoint;

    @Column(name="permission_point_name")
    private String permissionPointName;



    @Column(name="update_time")
    private Timestamp updateTime;

    @Column(name="update_by")
    private String updateBy;

    @Column(name="is_extend")
    private String isExtend;


}
