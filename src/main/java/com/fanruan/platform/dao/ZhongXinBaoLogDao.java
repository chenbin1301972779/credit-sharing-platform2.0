package com.fanruan.platform.dao;

import com.fanruan.platform.bean.ZhongXinBaoLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ZhongXinBaoLogDao extends JpaRepository<ZhongXinBaoLog,Integer> {
    Optional<ZhongXinBaoLog> findByCorpSerialNo(String corpSerialNo);

}
