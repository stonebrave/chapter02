package com.itheima.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname MyConfig
 * @Description TODO
 * @Date 2022/5/8 11:39
 * @Created by situ
 */
@Configuration
public class MyConfig {
    @Bean
    public MyService myService() {
        return new MyService();
    }
}
