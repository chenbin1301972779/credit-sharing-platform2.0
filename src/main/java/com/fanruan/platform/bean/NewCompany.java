package com.fanruan.platform.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "INPUT_HR_ORG")
public class NewCompany {
    @Id
    @Column(name="CODE")
    private String code;

    @Column(name="NAME")
    private String name;

    @Column(name="SPK_ORG")
    private String spkOrg;

    @Column(name="ENABLESTATE")
    private Integer enableState;

    @Column(name="SHORTNAME")
    private String shortName;

    @Column(name="SCODE")
    private String scode;

    @Column(name="SNAME")
    private String sname;

    @Column(name="TS")
    private String ts;

    @Column(name="DR")
    private Integer dr;

    @Column(name="UPDATETIME")
    private Timestamp updateTime;

    @Column(name="UPDATETIMEBY")
    private String updateTimeby;

    @Column(name="PK_ORG")
    private String pkOrg;
}
