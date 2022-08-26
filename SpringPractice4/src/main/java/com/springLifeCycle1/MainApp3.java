package com.springLifeCycle1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp3 {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("config3.xml");
        StudentDetails studentDetails=(StudentDetails) applicationContext.getBean("sd1");
        System.out.println(studentDetails);
        applicationContext.registerShutdownHook();
    }
}
