package com.spring.boot.controller;

import com.spring.boot.entity.User;
import com.spring.boot.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

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

}