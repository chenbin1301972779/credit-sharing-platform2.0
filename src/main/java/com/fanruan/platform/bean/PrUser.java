package com.fanruan.platform.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "credit_pr_user")
public class PrUser {
    @Id
    private String pk_psndoc;

    @Column(name="code")
    private String code;

    @Column(name="name")
    private String name;

    @Column(name="sign")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="spk_org")
    private String spk_org;

    @Column(name="orgcode")
    private String orgcode;

    @Column(name="orgname")
    private String orgname;

    @Column(name="spk_dept")
    private String spk_dept;

    @Column(name="deptcode")
    private String deptcode;

    @Column(name="deptname")
    private String deptname;

    @Column(name="mobile")
    private String mobile;

    @Column(name="email")
    private String email;

    @Column(name="officephone")
    private String officephone;

    @Column(name="sex")
    private String sex;

    @Column(name="birthdate")
    private String birthdate;

    @Column(name="begindate")
    private String begindate;

    @Column(name="trnsevent")
    private String trnsevent;

    @Column(name="id")
    private String id;

    @Column(name="idtype")
    private String idtype;

    @Column(name="array")
    private String array;

    @Column(name="status")
    private String status;

    @Column(name="delete_flag")
    private String delete_flag;

    @Column(name="update_time")
    private String update_time;
}
