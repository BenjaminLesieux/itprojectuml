package com.efrei.uml.entity;

import com.efrei.uml.course.Course;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String lastName;
    private String firstName;
    private String phoneNumber;

    private List<Course> courses;

    public Person(String lastName, String firstName, String phoneNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.courses = new ArrayList<>();
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public List<Course> getCourses() {
        return courses;
    }
}
