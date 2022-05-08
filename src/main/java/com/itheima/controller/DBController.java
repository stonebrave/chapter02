package com.itheima.controller;

import com.itheima.config.DBConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname DBController
 * @Description TODO
 * @Date 2022/5/8 11:54
 * @Created by situ
 */
@RestController
public class DBController {
    @Autowired
    private DBConnector dbConnector;
    @GetMapping("/showDB")
    public void showDB() {
        dbConnector.configure();
    }
}
