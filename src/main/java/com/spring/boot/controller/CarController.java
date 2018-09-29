package com.spring.boot.controller;

import com.spring.boot.service.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Administrator
 * @CreateTime 2018/9/29 14:24
 **/
@Controller
public class CarController {
    private static final Logger logger = LoggerFactory.getLogger(CarController.class);
    @Autowired
    private CarService carService;

    @GetMapping("/info")
    @ResponseBody
    public Object info(Long id){
        logger.info("获取关联数据信息");
        return  carService.info(id);
    }
}
