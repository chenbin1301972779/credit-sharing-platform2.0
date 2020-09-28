package com.fanruan.platform.dao;

import com.fanruan.platform.bean.TianYanChaConcern;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TianYanChaConcernDao extends JpaRepository<TianYanChaConcern,Integer> {
    Optional<TianYanChaConcern> findByCode(String code);
    List<TianYanChaConcern> findAll();
}
