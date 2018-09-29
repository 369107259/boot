package com.spring.boot.controller;

import com.spring.boot.service.CarService;
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
    @Autowired
    private CarService carService;

    @GetMapping("/info")
    @ResponseBody
    public Object info(Long id){
        return  carService.info(id);
    }
}
