package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
         Student s=(Student) context.getBean("std1");
         Student s1=(Student) context.getBean("std2");
        System.out.println(s);
        System.out.println(s1);
    }
}
