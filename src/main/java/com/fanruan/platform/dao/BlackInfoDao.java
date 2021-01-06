package com.fanruan.platform.dao;

import com.fanruan.platform.bean.Area;
import com.fanruan.platform.bean.BlackInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BlackInfoDao  extends JpaRepository<BlackInfo,Integer> {
    Optional<BlackInfo> findByPid(String code);
}
