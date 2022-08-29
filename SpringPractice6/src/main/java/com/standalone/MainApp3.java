package com.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp3 {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("config3.xml");
        Person person=(Person) context.getBean("ps1");
        System.out.println(person);
        System.out.println(person.getFriends().getClass().getName());
        System.out.println("_____________________________________");
        System.out.println(person.getFees());
        System.out.println(person.getFees().getClass().getName());
        System.out.println(person.getProperties());
    }
}
