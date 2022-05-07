package com.itheima.domain;

/**
 * @Classname Family
 * @Description TODO
 * @Date 2022/5/7 0:56
 * @Created by situ
 */
public class Family {
    private String type;
    private String username;

    public Family() {
    }

    public Family(String type, String username) {
        this.type = type;
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Family{" +
                "type='" + type + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
