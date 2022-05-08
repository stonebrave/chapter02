package com.itheima.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Classname DevDBConnector
 * @Description TODO
 * @Date 2022/5/8 11:50
 * @Created by situ
 */

@Configuration
@Profile("dev")
public class DevDBConnector implements DBConnector{
    @Override
    public void configure() {
        System.out.println("数据库配置环境dev");
    }
}
