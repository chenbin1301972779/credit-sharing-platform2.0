package com.fanruan.platform.dao;

import com.fanruan.platform.bean.BlackPush;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BlackPushDao extends JpaRepository<BlackPush,Integer> {
    Optional<BlackPush> findById(Integer id);
    List<BlackPush> findAllByPushFlag(String pushFlag);
    List<BlackPush> findAll();
}
