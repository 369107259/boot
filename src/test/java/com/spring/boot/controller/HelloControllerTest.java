package com.spring.boot.controller;

import com.spring.boot.service.component.RedisComponent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloController.class)
@AutoConfigureMockMvc
public class HelloControllerTest {
    @Autowired
    private MockMvc mvc;

    @Autowired
    RedisComponent redisComponent;

    @Test
    public void index() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(MockMvcResultMatchers.content().string("Hello World"));
    }

    @Test
    public  void  redisTest(){
        redisComponent.leftPush("redis","value");

        System.out.printf("redis================"+ redisComponent.leftPop("redis"));
    }
}