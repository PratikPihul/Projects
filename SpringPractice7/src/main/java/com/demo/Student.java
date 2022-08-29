package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student {
    @Value("Pratik Anant Pihul")
    private String studentName;
    @Value("City")
    private String city;
    @Value("10")
    private int rollNo;

    @Value("#{pratik1}")
    private List<String> addresses;

    public Student() {
    }


    public Student(String studentName, String city, int rollNo,List<String> addresses) {
        this.studentName = studentName;
        this.city = city;
        this.rollNo = rollNo;
        this.addresses=addresses;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                ", rollNo=" + rollNo +
                ", addresses=" + addresses +
                '}';
    }
}
