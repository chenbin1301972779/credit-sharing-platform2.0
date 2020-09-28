package com.fanruan.platform.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "DIM_ZCX_AREA")
public class Area {

    @Id
    @Column(name="AREACODE")
    private String areaCode;

    @Column(name="AREANAME")
    private String areaName;

    @Column(name="AREALEVEL")
    @JsonIgnore
    private String areaLevel;

    @Column(name="AREASCODE")
    @JsonIgnore
    private String areaScode;

    @Column(name="CITYCODE")
    @JsonIgnore
    private String cityCode;

    @Column(name="EMAILCODE")
    @JsonIgnore
    private String emailCode;

    @Column(name="PINYIN")
    @JsonIgnore
    private String pinyin;

    @Transient
    private List<Area> children;


}
