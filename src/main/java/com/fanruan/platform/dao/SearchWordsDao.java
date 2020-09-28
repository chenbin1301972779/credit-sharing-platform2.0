package com.fanruan.platform.dao;

import com.fanruan.platform.bean.SearchWords;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SearchWordsDao extends JpaRepository<SearchWords,Integer> {

    Page<SearchWords> findAllByUserId(Integer userId,Pageable pageable);
    Page<SearchWords> findDistinctKeyWordByUserId(Integer userId,Pageable pageable);
    Optional<SearchWords> findById(Integer id);
}
