package com.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("company")
public class Company {
    @Value("Infosys")
    private String company;
   @Value("4")
    private String ctc;
   @Value("#{cmp1}")
    private List<String> locations;

    public Company() {
    }

    public Company(String company, String ctc, List<String> locations) {
        this.company = company;
        this.ctc = ctc;
        this.locations = locations;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCtc() {
        return ctc;
    }

    public void setCtc(String ctc) {
        this.ctc = ctc;
    }

    public List<String> getLocations() {
        return locations;
    }


    public void setLocations(List<String> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Company{" +
                "company='" + company + '\'' +
                ", ctc='" + ctc + '\'' +
                ", locations=" + locations +
                '}';
    }
}
