package com.itheima.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Classname TestDBConnector
 * @Description TODO
 * @Date 2022/5/8 11:51
 * @Created by situ
 */
@Configuration
@Profile("test")
public class TestDBConnector implements DBConnector{
    @Override
    public void configure() {
        System.out.println("数据库配置环境test");
    }
}
