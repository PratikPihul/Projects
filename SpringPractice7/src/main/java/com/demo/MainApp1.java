package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp1 {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("config1.xml");
        Student student1=(Student) context.getBean("student");
        System.out.println(student1);
    }
}
