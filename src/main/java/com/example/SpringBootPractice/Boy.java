package com.example.SpringBootPractice;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Boy {

    @Autowired
    private ObjectMapper objectMapper;

    public  void userObjectMapper(){
        System.out.println("Object Mapper:" +objectMapper);
    }
}
