package com.fanruan.platform.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "LOG_TYC_CONCERN")
@IdClass(TycConcernPrimaryKey.class)
public class TianYanChaConcern implements Serializable {

    @Id
    @Column(name="CODE")
    private String code;

    @Column(name="ENTNAME")
    private String entName;

    //TODO 设置联合主键
    @Id
    @Column(name="UPDATEBY")
    private String updateby;

    @Column(name="UPDATETIME")
    private Timestamp updateTime;

    @Column(name="CONCERN_FLAG")
    private String concernFlag;



}
