package com.fanruan.platform.bean;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "credit_risk_info")
public class RiskInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "risk_seq")
    @SequenceGenerator(name = "risk_seq", initialValue = 1, allocationSize = 1, sequenceName = "RISK_SEQUENCE")
    private Integer id;
    /**
     * 风险来源,(企查查，中信保，中诚信)
     */
    @Column(name="risk_source")
    private String riskSource;
    /**
     * 风险推送者
     */
    @Column(name="risk_pusher")
    private String riskPusher;
    /**
     * 风险数据
     */
    @Lob @Basic(fetch=FetchType.LAZY)
    @Column(name="risk_info")
    private String riskInfo;
    /**
     * 风险级别
     */
    @Column(name="risk_level")
    private Integer riskLevel;

    /**
     * 推送时间
     */
    @Column(name="push_time")
    private Timestamp pushTime;
}
