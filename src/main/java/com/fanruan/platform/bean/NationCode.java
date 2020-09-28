package com.fanruan.platform.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "DIM_ZXB_NATION")
public class NationCode {
    @Id
    @Column(name="NATIONCODE")
    private String nationCode;

    @Column(name="NATIONNAME")
    private String nationName;
}
