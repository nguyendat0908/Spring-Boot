package com.example.SpringBootPractice;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Quản ly bean
@Configuration
public class AppConfig {

    @Bean
    public Boy boy() {
        return new Boy();
    }

    @Bean
    public ObjectMapper objectMapper (){
        return new ObjectMapper();
    }
}
