package com.fanruan.platform.dao;

import com.fanruan.platform.bean.MessageInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageInfoDao extends JpaRepository<MessageInfo,Integer> {
}
