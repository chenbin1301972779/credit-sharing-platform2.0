package com.fanruan.platform.dao;

import com.fanruan.platform.bean.NewCompany;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface NewCompanyDao extends JpaRepository<NewCompany,Integer> {
    Optional<NewCompany> findByCode(String code);
    List<NewCompany> findAll();
}
