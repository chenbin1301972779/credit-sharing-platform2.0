package com.fanruan.platform.bean;
 
import lombok.Data;

import java.io.Serializable;
 
@Data
public class EmailEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    //邮箱服务器地址
    private String host;
    //主机端口
    private Integer port;
    //发送者的邮箱账号
    private String userName;
    //发送者的密码
    private String password;
    //发送者的邮箱地址
    private String fromAddress;
    //接收者的邮箱地址
    private String toAddress;
    //设置邮件主题
    private String subject;
    //设置邮件内容
    private String context;
    //设置邮件类型
    private String contextType;
}