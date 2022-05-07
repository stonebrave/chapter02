package com.itheima.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @Classname Student
 * @Description TODO
 * @Date 2022/5/7 20:38
 * @Created by situ
 */
@Component
public class Student {
    @Value("#{2*4}")
    private int id;
    @Value("${person.name}")
    private String name;
    private List hobby;
    private String[] family;
    private Map map;
    private Pet pet;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobby=" + hobby +
                ", family=" + Arrays.toString(family) +
                ", map=" + map +
                ", pet=" + pet +
                '}';
    }
}
