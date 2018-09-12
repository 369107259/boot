package com.spring.boot.mapper;

import com.spring.boot.entity.User;
import org.apache.ibatis.annotations.Mapper;


public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}