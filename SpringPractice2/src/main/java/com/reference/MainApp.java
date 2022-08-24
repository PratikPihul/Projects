package com.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("config2.xml");
        A  a=(A)context.getBean("aRef");
        B  b=(B)context.getBean("bRef");
        System.out.println(a);
        System.out.println(b);
    }
}
