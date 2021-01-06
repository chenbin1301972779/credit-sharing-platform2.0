package com.fanruan.platform.bean;

import lombok.Data;
import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "INPUT_CUSTOM_HAND")
public class InitialScreeningOfMerchants {
    @Id
    @Column(name="FID")
    private String fid; // 客商信息表_手动填报 ID


    @Column(name="SERIALID")
    private String serialid; // 流水号

    @Column(name="CUSTOM_SOCIAL_CODE")
    private String customSocialCode; // 客商社会信用代码

    @Column(name="CUSTOM_NAME")
    private String customName; // 客商全称

    @Column(name="CUSTOM_CREDIT_CODE")
    private String customCreditCode; // 客商信保代码

    @Column(name="DUNS_CODE")
    private String dunsCode; // 邓白氏码

    @Column(name="CUSTOM_EXPORT_CODE")
    private String customExportCode; // 客商海关编码

    @Column(name="PROVINCE")
    private String province; // 省份

    @Column(name="CITY")
    private String city; // 地级市

    @Column(name="NATION_TYPE")
    private String nationType; // 国内外类型

    @Column(name="COMPANY_TYPE")
    private String companyType; // 公司类型

    @Column(name="UPDATEBY")
    private String updateBy; // 填报人

    @Column(name="UPDATETIME")
    private Timestamp updateTime; // 填报时间

}
