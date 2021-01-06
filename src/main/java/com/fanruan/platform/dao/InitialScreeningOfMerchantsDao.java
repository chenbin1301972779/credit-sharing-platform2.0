package com.fanruan.platform.dao;

import com.fanruan.platform.bean.InitialScreeningOfMerchants;
import com.fanruan.platform.bean.OpenAPIToken;
import com.fanruan.platform.bean.UserFocus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface InitialScreeningOfMerchantsDao extends JpaRepository<InitialScreeningOfMerchants,Integer> {

}
