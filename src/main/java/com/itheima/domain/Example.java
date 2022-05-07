package com.itheima.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;

/**
 * @Classname Example
 * @Description TODO
 * @Date 2022/5/7 22:35
 * @Created by situ
 */
@Component
@Validated
public class Example {
    @Email
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Example{" +
                "email='" + email + '\'' +
                '}';
    }
}
