package com.csdn.anno;

public class Test {

    public static void main(String[] args) {
        //1.获取需要解析注解的类
        Class<Teacher> clazz = Teacher.class;
        //2.判断该类上是否有注解
        if (clazz.isAnnotationPresent(MyAnnotation.class)) {
            //3.获取该类上的注解
            MyAnnotation myAnnotation = clazz.getAnnotation(MyAnnotation.class);
            //4.打印出注解上的内容
            System.out.println(myAnnotation.name() + ":" + myAnnotation.age());
        }
    }
}
