package com.csdn.config;

import com.csdn.domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig01 {

    @Bean
    public Person p1(){
        return new Person();

    }
}
