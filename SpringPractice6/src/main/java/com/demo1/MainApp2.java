    package com.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config2.xml");
        Cricket cricket=(Cricket) context.getBean("ct1");
        System.out.println(cricket);
    }
}
