package com.fanruan.platform.dao;

import com.fanruan.platform.bean.Company;
import com.fanruan.platform.bean.CompanyExtendInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CompanyExtendInfoDao extends JpaRepository<CompanyExtendInfo,Integer> {
    Optional<CompanyExtendInfo> findById(Integer id);
    List<CompanyExtendInfo> findByCid(Integer companyId);
}
