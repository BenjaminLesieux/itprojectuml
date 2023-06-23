package com.efrei.uml.entity;

import com.efrei.uml.course.Theme;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person {
    private Company company;
    private String username;
    private List<Theme> interests;

    public Client(String lastName, String firstName, String phoneNumber, Company company, String username) {
        super(lastName, firstName, phoneNumber);
        this.company = company;
        this.username = username;
        this.interests = new ArrayList<>();
    }

    public Company getCompany() {
        return company;
    }

    public String getUsername() {
        return username;
    }

    public List<Theme> getInterests() {
        return interests;
    }
}
