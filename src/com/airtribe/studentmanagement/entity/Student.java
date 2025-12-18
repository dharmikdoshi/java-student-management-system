package com.airtribe.studentmanagement.entity;

import com.airtribe.studentmanagement.util.Registrable;

public class Student extends Person implements Registrable {

    private String course;

    public Student(int id, String name, String email, String course) {
        super(id, name, email);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String getDetails() {
        return "Student ID: " + getId() + ", Name: " + getName();
    }

    @Override
    public String getRole() {
        return "Student";
    }

    @Override
    public String getRegistrationDetails() {
        return "Student Registration ID: " + getId();
    }

}
