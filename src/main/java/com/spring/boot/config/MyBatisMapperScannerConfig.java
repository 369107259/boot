package com.spring.boot.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Administrator
 * @CreateTime 2018/9/11 18:19
 **/
@Configuration
@AutoConfigureAfter(MyBatisConfig.class)
public class MyBatisMapperScannerConfig {
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        //对应<property name="sqlSessionFactoryBeanName" value="sqlSessionFactory" />
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        //对应<property name="basePackage" value="com.lcl.springBoot.dao" />
        mapperScannerConfigurer.setBasePackage("com.spring.boot.mapper");
        return mapperScannerConfigurer;
    }

}
