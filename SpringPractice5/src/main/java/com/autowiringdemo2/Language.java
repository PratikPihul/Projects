package com.autowiringdemo2;

public class Language {
    private int noOfLangs;
    private String langs;

    public Language() {
    }

    public Language(int noOfLangs, String langs) {
        this.noOfLangs = noOfLangs;
        this.langs = langs;
    }

    public int getNoOfLangs() {
        return noOfLangs;
    }

    public void setNoOfLangs(int noOfLangs) {
        this.noOfLangs = noOfLangs;
    }

    public String getLangs() {
        return langs;
    }

    public void setLangs(String langs) {
        this.langs = langs;
    }

    @Override
    public String toString() {
        return "Language{" +
                "noOfLangs=" + noOfLangs +
                ", langs='" + langs + '\'' +
                '}';
    }
}

