package com.fanruan.platform.mapper;

import com.fanruan.platform.bean.BlackList;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>TODO</p>
 *
 * @author DELk
 * @@version 1.0.0
 * @since 2020/9/28
 */
@Repository
public interface CommonsMapper {
    List<BlackList> getBlackList(String userCode);
}
