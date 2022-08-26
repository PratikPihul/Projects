package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Addition a=(Addition) context.getBean("add1");
        Addition a1=(Addition) context.getBean("add2");
       a.doSum();
       a1.doSum();
    }
}
