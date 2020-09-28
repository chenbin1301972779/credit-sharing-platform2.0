package com.fanruan.platform.dao;

import com.fanruan.platform.bean.Report;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

public interface ReportDao extends JpaRepository<Report,Integer> {
    Optional<Report> findById(Integer id);
    Optional<Report> findByFileName(String fileName);
    List<Report> findAllByCreditCodeAndAndReportTypeOrderByUpdateTimeDesc(String creditCode,String reportType);
    List<Report> findAllByCreditCodeOrderByUpdateTimeDesc(String creditCode);
    List<Report> findAll();
}
