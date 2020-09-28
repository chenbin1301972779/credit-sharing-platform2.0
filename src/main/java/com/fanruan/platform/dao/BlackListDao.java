package com.fanruan.platform.dao;

import com.fanruan.platform.bean.BlackList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

public interface BlackListDao extends JpaRepository<BlackList,Integer> {

    List<BlackList> findAllByStatusAndStartDateBeforeAndEndDateAfter(String status, Date start,Date end);
    List<BlackList> findAllByStatusAndStartDateAfter(String status, Date start);
    List<BlackList> findAllByStatus(String status);

}
