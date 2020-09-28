package com.fanruan.platform.bean;

import lombok.Data;
import org.apache.ibatis.annotations.Result;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "credit_report_push")
public class ReportPush {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "report_seq")
    @SequenceGenerator(name = "report_seq", initialValue = 1, allocationSize = 1, sequenceName = "report_SEQUENCE")
    private Integer id;

    @Column(name="USERID")
    private Integer userId;

    /**
     *下单流水号
     */
    @Column(name="CORPSERIALNO")
    private String corpSerialNo;

    /**
     * 通知序号
     */
    @Column(name="SERIALNO")
    private String serialNo;


    /**
     * 企业标识
     */
    @Column(name="CLIENTNO")
    private String clientNo;

    /**
     * 订单编号
     */
    @Column(name="ORDERNO")
    private String orderNo;

    /**
     * 订单编号
     */
    @Column(name="EMAIL")
    private String email;

    /**
     * RESULT_TYPE为0是失败，其余为成功
     */
    @Column(name="RESULT_TYPE")
    private String resultType;

    /**
     * promptInfo
     */
    @Column(name="PROMPTINFO")
    private String promptInfo;

    /**
     * results
     */
    @Column(name="RESULTS")
    private String results;

    /**
     * 邮件发送标识
     */
    @Column(name="email_flag")
    private Integer emailFlag;

    /**
     * 站内信标识
     */
    @Column(name="push_flag")
    private Integer pushFlag;

    /**
     * 邮件推送时间
     */
    @Column(name="email_time")
    private Timestamp emailTime;

    /**
     * 站内信推送时间
     */
    @Column(name="push_time")
    private Timestamp pushTime;
}
