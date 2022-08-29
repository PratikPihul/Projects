package com.standalone1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp4 {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("config4.xml");
        Youtube youtube=(Youtube) context.getBean("yt1");
        Youtube youtube1=(Youtube) context.getBean("yt2");
        System.out.println(youtube);
        System.out.println(youtube1);
    }
}
