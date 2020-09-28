package com.fanruan.platform.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "INPUT_BLACKLIST")
public class BlackList {
    @Id
    @Column(name="PID")
    private String pid;

    @Column(name="ENTNAME")
    private String entName;

    @Column(name="CODE")
    private String code;

    @Column(name="START_DATE")
    private Date startDate;

    @Column(name="END_DATE")
    private Date endDate;

    @Column(name="GRADE")
    private String grade;

    @Column(name="REASON")
    private String reason;

    @Column(name="REASON_URL")
    private String reasonUrl;

    @Column(name="PUBLISH_DEPT")
    private String publishDept;

    @Column(name="APPROVE_DEPT")
    private String approveDept;

    @Column(name="PUBLISH_TIME")
    private Timestamp publishTime;

    @Column(name="TYPE")
    private String type;

    @Column(name="STATUS")
    private String status;

    @Column(name="APPROVE_TIME")
    private Date approveTime;

    @Column(name="UPDATEBY")
    private String updateby;

    @Column(name="CANCEL_BY")
    private String cancelBy;

    @Column(name="CANCEL_TIME")
    private String cancelTime;

    @Column(name="CANCEL_REASON")
    private String cancelReason;

}


