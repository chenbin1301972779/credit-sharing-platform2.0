package com.fanruan.platform.dao;

import com.fanruan.platform.bean.Company;
import com.fanruan.platform.bean.TianYanChaInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TianYanChaInfoDao extends JpaRepository<TianYanChaInfo,Integer> {
    Optional<TianYanChaInfo> findById(Integer id);
    Optional<TianYanChaInfo> findByCreditCode(String creditCodes);

}
