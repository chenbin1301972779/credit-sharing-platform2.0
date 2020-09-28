package com.fanruan.platform.dao;

import com.fanruan.platform.bean.Company;
import com.fanruan.platform.bean.RiskInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

public interface RiskInfoDao extends JpaRepository<RiskInfo,Integer> {
    List<RiskInfo> findByPushTimeAfterOrderByPushTimeDesc(Timestamp pushTime);
    List<RiskInfo> findByPushTimeAfterAndRiskSourceOrderByPushTimeDesc(Timestamp pushTime,String riskSource);
    Optional<RiskInfo> findById(Integer id);
}
