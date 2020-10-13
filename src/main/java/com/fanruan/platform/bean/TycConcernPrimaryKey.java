package com.fanruan.platform.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *     天眼查联合主键
 * </p>
 *
 * @author DELk
 * @@version 1.0.0
 * @since 2020/10/13
 */
@Data
public class TycConcernPrimaryKey implements Serializable {
    private String code;
    private String updateby;
}
