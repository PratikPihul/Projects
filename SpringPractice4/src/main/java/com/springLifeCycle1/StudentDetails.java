package com.springLifeCycle1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentDetails {
    private int id;
    private String name;
    private String address;

    public StudentDetails() {
    }

    public StudentDetails(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    @PostConstruct
    public void myInit(){
        System.out.println("This is my Init");
    }
    @PreDestroy
    public void myDestroy(){
        System.out.println("This is my Destroy");
    }
}
