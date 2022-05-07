package com.itheima;

import com.itheima.domain.Example;
import com.itheima.domain.Person;
import com.itheima.domain.Student;
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

}
