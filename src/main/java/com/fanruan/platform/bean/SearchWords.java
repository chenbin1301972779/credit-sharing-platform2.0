package com.fanruan.platform.bean;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "credit_search_words")
public class SearchWords {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "searchwords_seq")
    @SequenceGenerator(name = "searchwords_seq", initialValue = 1, allocationSize = 1, sequenceName = "SEARCHWORDS_SEQUENCE")
    private Integer id;

    @Column(name="user_id")
    private Integer userId;

    @Column(name="key_word")
    private String keyWord;

    @Column(name="search_time")
    private Timestamp searchTime;

}
