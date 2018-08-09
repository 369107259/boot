package com.spring.boot.controller;

import com.spring.boot.entity.User;
import com.spring.boot.service.component.RedisComponent;
import com.spring.boot.utils.ObjectMapperUtil;
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
    private RedisComponent redisComponent;
    @ApiIgnore
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() throws Exception {
        User user =new User();
        user.setAge(12);
        user.setId((long) 21);
        user.setName("huangyong");
        redisComponent.set("user", ObjectMapperUtil.toJsonString(user));
        redisComponent.leftPush("liwei","langrenpipa");
        logger.info("values=============="+ redisComponent.leftPop("liwei"));
        logger.info(redisComponent.get("user").toString());
        return null;
    }

}