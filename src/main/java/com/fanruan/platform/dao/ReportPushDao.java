package com.fanruan.platform.dao;

import com.fanruan.platform.bean.ReportPush;
import com.fanruan.platform.bean.ZhongXinBaoLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ReportPushDao extends JpaRepository<ReportPush,Integer> {
    Optional<ReportPush> findById(Integer id);
    Optional<ReportPush> findByCorpSerialNo(String corpSerialNo);
    List<ReportPush> findAllByEmailFlagAndPushFlag(Integer emailFlag,Integer pushFlag);
    List<ReportPush> findAllByUserIdAndClientNo(Integer userId, String clientNo);
}
