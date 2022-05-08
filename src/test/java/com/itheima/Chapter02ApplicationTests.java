package com.itheima;

import com.itheima.domain.Example;
import com.itheima.domain.MyProperties;
import com.itheima.domain.Person;
import com.itheima.domain.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Chapter02ApplicationTests {
    @Autowired
    private Person person;
    @Test
    void contextLoads() {
        System.out.println(person);
    }

    @Autowired
    private Student student;
    @Test
    public void studentTest() {
        System.out.println(student);
    }

    @Autowired
    private Example example;
    @Test
    public void exampleTest() {
        System.out.println(example);
    }

    @Autowired
    private MyProperties myProperties;
    @Test
    public void myPropertiesTest() {
        System.out.println(myProperties);
    }

    @Autowired
    private ApplicationContext applicationContext;
    @Test
    public void iocTest(){
        System.out.println(applicationContext.containsBean("myService"));
    }

    @Value(("${tom.description}"))
    private String description;
    @Test
    public void placeholderTest() {
        System.out.println(description);
    }
}
