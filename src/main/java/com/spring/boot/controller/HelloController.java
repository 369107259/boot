package com.spring.boot.controller;

import com.github.pagehelper.PageHelper;
import com.spring.boot.entity.User;
import com.spring.boot.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Autowired
    private UserServiceImpl userService;
    @ApiIgnore
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index(Long id) throws Exception {
        User user = userService.getUser(id);
        return user.getUserName();
    }
    @GetMapping(value = "findAll")
    public List<User> findAll(){
        List<User> list = userService.findAll();
        return list;
    }
}