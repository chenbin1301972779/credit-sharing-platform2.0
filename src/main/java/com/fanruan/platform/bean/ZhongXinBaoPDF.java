package com.fanruan.platform.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "ODS_ZXB_PDF")
public class ZhongXinBaoPDF {
    @Id
    @Column(name="NOTICESERIALNO")
    private String noticeSerialno;

    @Column(name="UPDATETIME")
    private String updateTime;

    @Column(name="ETL_FLAG")
    private String etlFlag;

}
