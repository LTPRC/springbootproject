package com.github.ltprc.entity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PersonTest {

    @Autowired
    Person person;
    
    @Test
    void contextLoads() {
        System.out.println(person);
    }
}
