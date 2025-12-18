package com.airtribe.studentmanagement.service;

import com.airtribe.studentmanagement.entity.Enrollment;
import com.airtribe.studentmanagement.entity.Student;
import com.airtribe.studentmanagement.entity.Course;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentService {

    private List<Enrollment> enrollments = new ArrayList<>();

    public void enrollStudent(Student student, Course course) {
        Enrollment enrollment = new Enrollment(student, course);
        enrollments.add(enrollment);
    }

    public List<Enrollment> getAllEnrollments() {
        return enrollments;
    }

    public void viewAllEnrollments() {

        if (enrollments.isEmpty()) {
            System.out.println("No enrollments available.");
            return;
        }

        for (Enrollment enrollment : enrollments) {
            System.out.println(
                    "Student ID: " + enrollment.getStudent().getId() +
                            ", Student Name: " + enrollment.getStudent().getName() +
                            " -> Course: " + enrollment.getCourse().getCourseName());
        }
    }

}
