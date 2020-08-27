package com.csdn.config;

import com.csdn.domain.Person;
import com.csdn.impo.MyImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MyImportSelector.class)
public class PersonConfig {

}
