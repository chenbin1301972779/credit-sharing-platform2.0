package com.fanruan.platform.bean;

import lombok.Data;

@Data
public class BlacklistResultList {
    private String pid;
    private String entName;  // 企业名称
    private String startDate; // 公开时间
    private String reason;
    private String grade;
    private String publishBy;
    private String publishDept;
    private String publishTime;
    private String status;
    private String reasonUrl;
    private String type;
    private String creditCode;
    private String approveBy;
    private String approveTime;
    private String operationSelection;
    private String reasonsForRenewal;
    private String approveRemarks;
    private String cancelBy;
    private String cancelTime;
    private String cancelReason;
}
