package com.springDemo1;

public class Student {
     private  int id;
     private  String name;
     private  String town;

    public Student() {

    }

    public Student(int id, String name, String town) {
        this.id = id;
        this.name = name;
        this.town = town;
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

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", town='" + town + '\'' +
                '}';
    }
    public void myInit(){

        System.out.println("Here it is initializing my spring code");

    }
    public void myDestroy(){

        System.out.println("Here it is Destroying my spring code");

    }
}
