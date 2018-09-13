package com.spring.boot.service.impl;

import com.github.pagehelper.PageHelper;
import com.spring.boot.entity.User;
import com.spring.boot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Administrator
 * @CreateTime 2018/9/12 9:41
 **/
@Service
public class UserServiceImpl {
    @Autowired
    private UserMapper userMapper;

    public User getUser(Long id){
       return userMapper.selectByPrimaryKey(id);
    }

    public List<User> findAll() {
        PageHelper.startPage(1,2);
        return userMapper.selectAll();
    }
}
