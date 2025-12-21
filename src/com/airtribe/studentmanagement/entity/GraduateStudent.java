package com.airtribe.studentmanagement.entity;

import com.airtribe.studentmanagement.util.Registrable;

public class GraduateStudent extends Student implements Registrable {

    private String specialization;

    /*
     * Default constructor
     */
    public GraduateStudent() {
        this(0, "NA", "NA", "NA", "NA");
    }

    public GraduateStudent(int id, String name, String email, String courseName, String specialization) {
        super(id, name, email, courseName);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Specialization: " + specialization;
    }

    @Override
    public String getRole() {
        return "Graduate Student";
    }

    @Override
    public String getRegistrationDetails() {
        return "Graduate Student Registration ID: " + getId();
    }

}
