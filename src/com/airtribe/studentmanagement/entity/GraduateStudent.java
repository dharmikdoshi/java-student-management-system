package com.airtribe.studentmanagement.entity;

public class GraduateStudent extends Student {

    private String specialization;

    public GraduateStudent(int id, String name, String email, String courseName, String specialization) {
        super(id, name, email, courseName);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }
}
