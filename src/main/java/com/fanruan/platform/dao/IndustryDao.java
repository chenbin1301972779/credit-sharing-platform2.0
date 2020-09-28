package com.fanruan.platform.dao;

import com.fanruan.platform.bean.Industry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IndustryDao extends JpaRepository<Industry,Integer> {
    List<Industry> findAllByIndustry1(String industry1);
    List<Industry> findAll();
}
