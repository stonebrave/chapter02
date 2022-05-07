package com.itheima.domain;

/**
 * @Classname Pet
 * @Description TODO
 * @Date 2022/5/7 0:45
 * @Created by situ
 */
public class Pet {
    private String type;
    private String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
