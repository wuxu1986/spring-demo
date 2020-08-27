package com.csdn.anno;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnnotation{

    String name();  // 等同于String name;
    int age() default 17;
    String hello() default "spring boot";
}
