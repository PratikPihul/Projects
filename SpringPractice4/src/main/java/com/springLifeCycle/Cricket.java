package com.springLifeCycle;

public class Cricket {
     private int noOfTeams;

    public Cricket(int noOfTeams) {
        this.noOfTeams = noOfTeams;
    }

    public Cricket() {
    }

    public int getNoOfTeams() {
        return noOfTeams;
    }

    public void setNoOfTeams(int noOfTeams) {
        System.out.println("Setting Property");
        this.noOfTeams = noOfTeams;
    }

    @Override
    public String toString() {
        return "Cricket{" +
                "noOfTeams=" + noOfTeams +
                '}';
    }
    public void init(){
        System.out.println("Inside Init");
    }
    public void destroy(){
        System.out.println("Inside destroy");
    }
}
