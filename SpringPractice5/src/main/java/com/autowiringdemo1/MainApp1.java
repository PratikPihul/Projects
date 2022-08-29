package com.autowiringdemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp1 {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config2.xml");

        Cricket cricket=(Cricket) applicationContext.getBean("c1");
        System.out.println(cricket);




    }
}
