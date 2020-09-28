package com.fanruan.platform.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "DIM_ZCX_INDUSTRY")
public class Industry {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "industry_seq")
    @SequenceGenerator(name = "industry_seq", initialValue = 1, allocationSize = 1, sequenceName = "INDUSTRY_SEQUENCE")
    private Integer industryId;

    @Column(name="INDUSTRY_1")
    private String industry1;

    @Column(name="INDUSTRY_2")
    private String industry2;


}
