package com.spring.boot.service;

import com.spring.boot.mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Author Administrator
 * @CreateTime 2018/9/29 14:21
 **/
@Service
public class CarService {
    @Autowired
    private CarMapper carMapper;

    public Object info(Long id){
        Map map = carMapper.selectByTest(id);
        return map;
    }
}
