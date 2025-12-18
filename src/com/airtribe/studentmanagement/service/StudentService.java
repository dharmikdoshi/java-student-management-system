package com.airtribe.studentmanagement.service;

import com.airtribe.studentmanagement.entity.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    public boolean addStudent(Student student) {

        if (student.getId() <= 0) {
            System.out.println("Student ID must be greater than 0.");
            return false;
        }

        for (Student existing : students) {
            if (existing.getId() == student.getId()) {
                System.out.println("Student with this ID already exists.");
                return false;
            }
        }

        students.add(student);
        return true;
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public void viewAllStudents() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student student : students) {
            System.out.println(
                    "ID: " + student.getId() +
                            ", Name: " + student.getName() +
                            ", Email: " + student.getEmail() +
                            ", Course: " + student.getCourse());
        }
    }

    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
}
