package com.airtribe.studentmanagement.entity;

public class Student extends Person {

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
}
