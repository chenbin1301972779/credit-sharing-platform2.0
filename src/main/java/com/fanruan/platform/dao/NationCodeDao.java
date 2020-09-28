package com.fanruan.platform.dao;

import com.fanruan.platform.bean.NationCode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NationCodeDao extends JpaRepository<NationCode,Integer> {
    List<NationCode> findAll();
}
