package com.demo;

public class Address {
     private String city;
     private String cityRoad;

    public Address() {
    }

    public Address(String city, String cityRoad) {
        this.city = city;
        this.cityRoad = cityRoad;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityRoad() {
        return cityRoad;
    }

    public void setCityRoad(String cityRoad) {
        this.cityRoad = cityRoad;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", cityRoad='" + cityRoad + '\'' +
                '}';
    }
}
