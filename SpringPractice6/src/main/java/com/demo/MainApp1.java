package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp1 {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config1.xml");
        Student student=(Student)  applicationContext.getBean("sd1");
        System.out.println(student);

    }
}
