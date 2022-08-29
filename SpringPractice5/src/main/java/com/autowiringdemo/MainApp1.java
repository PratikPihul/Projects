package com.autowiringdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp1 {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
         Employee employee=(Employee)context.getBean("emp1");
         System.out.println(employee);

     }
}
