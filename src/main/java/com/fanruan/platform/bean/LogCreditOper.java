package com.fanruan.platform.bean;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;

/**
 * <p>TODO</p>
 *
 * @author DELk
 * @@version 1.0.0
 * @since 2020/9/17
 */
@Data
@Entity
@Table(name="LOG_CREDIT_OPER")
public class LogCreditOper {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "user_Name")
    private String userName;
    @Column(name = "user_Code")
    private String userCode;
    @Column(name = "form_Path")
    private String formPath;
    @Column(name = "form_Page_Name")
    private String formPageName;
    @Column(name = "to_Path")
    private String toPath;
    @Column(name = "to_Page_Name")
    private String toPageName;
    @Column(name = "query_Para")
    private String queryPara;
    @Column(name = "q_Date")
    private Date qDate;
}
