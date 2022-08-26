package com.springLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp1 {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("config1.xml");
        //Cricket c=(Cricket)applicationContext.getBean("c1");
        //System.out.println(c);
        Player p=(Player)  applicationContext.getBean("p1");
        System.out.println(p);
        applicationContext.registerShutdownHook();

    }
}
