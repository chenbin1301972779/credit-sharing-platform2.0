package com.fanruan.platform.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "LOG_TYC_CONCERN")
public class TianYanChaConcern implements Serializable {

    @Id
    @Column(name="CODE")
    private String code;

    @Column(name="ENTNAME")
    private String entName;

    @Column(name="UPDATEBY")
    private String updateby;

    @Column(name="UPDATETIME")
    private Timestamp updateTime;

    @Column(name="CONCERN_FLAG")
    private String concernFlag;



}
