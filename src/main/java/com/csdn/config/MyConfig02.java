package com.csdn.config;

import com.csdn.domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig02 {
    @Bean
    public Person p2(){
        return new Person();
    }
}
