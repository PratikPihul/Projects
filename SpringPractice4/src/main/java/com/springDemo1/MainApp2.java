package com.springDemo1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2 {
    public static void main(String[] args) {

        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("config2.xml");
        Student student=(Student) applicationContext.getBean("s1");
        System.out.println(student);
        applicationContext.registerShutdownHook();
    }
}
