package com.fanruan.platform.dao;

import com.fanruan.platform.bean.OpenAPIToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OpenAPITokenDao extends JpaRepository<OpenAPIToken,Integer> {
    Optional<OpenAPIToken>   findByTokenId(String tokenId);
    List<OpenAPIToken> findAll();
}
