package com.csdn.config;


import com.csdn.domain.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration   // 就相当于将MyConfiguration   ---->  applicationContext.xml
@ComponentScan("com.csdn.domain")
public class MyConfiguration {

}
