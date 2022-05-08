package com.itheima.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Classname MyProperties
 * @Description TODO
 * @Date 2022/5/7 23:02
 * @Created by situ
 */
@Configuration
@PropertySource("classpath:test.properties")
@EnableConfigurationProperties(MyProperties.class)
@ConfigurationProperties(prefix = "test")
public class MyProperties {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "MyProperties{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
