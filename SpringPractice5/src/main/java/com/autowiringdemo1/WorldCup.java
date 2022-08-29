package com.autowiringdemo1;

public class WorldCup {
    private int noOfWorldCup;
    private String mostWcp;

    public WorldCup() {
    }

    public WorldCup(int noOfWorldCup, String mostWcp) {
        this.noOfWorldCup = noOfWorldCup;
        this.mostWcp = mostWcp;
    }

    public int getNoOfWorldCup() {
        return noOfWorldCup;
    }

    public void setNoOfWorldCup(int noOfWorldCup) {
        this.noOfWorldCup = noOfWorldCup;
    }

    public String getMostWcp() {
        return mostWcp;
    }

    public void setMostWcp(String mostWcp) {
        this.mostWcp = mostWcp;
    }

    @Override
    public String toString() {
        return "WorldCup{" +
                "noOfWorldCup=" + noOfWorldCup +
                ", mostWcp='" + mostWcp + '\'' +
                '}';
    }
}
