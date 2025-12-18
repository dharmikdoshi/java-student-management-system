package com.airtribe.studentmanagement;

import com.airtribe.studentmanagement.entity.Student;
import com.airtribe.studentmanagement.entity.Course;
import com.airtribe.studentmanagement.service.StudentService;
import com.airtribe.studentmanagement.service.CourseService;
import com.airtribe.studentmanagement.service.EnrollmentService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        EnrollmentService enrollmentService = new EnrollmentService();

        boolean running = true;

        while (running) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Enroll Student");
            System.out.println("4. View Students");
            System.out.println("5. View Courses");
            System.out.println("6. View Enrollments");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter Course Name: ");
                    String courseName = scanner.nextLine();

                    Student student = new Student(studentId, name, email, courseName);
                    boolean added = studentService.addStudent(student);

                    if (added) {
                        System.out.println("Student added successfully.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Course ID: ");
                    int courseId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Course Name: ");
                    String cName = scanner.nextLine();

                    Course course = new Course(courseId, cName);
                    boolean addedCourse = courseService.addCourse(course);

                    if (addedCourse) {
                        System.out.println("Course added successfully.");
                    }

                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int sId = scanner.nextInt();

                    System.out.print("Enter Course ID: ");
                    int cId = scanner.nextInt();

                    Student s = studentService.getStudentById(sId);
                    Course c = courseService.getCourseById(cId);

                    if (s != null && c != null) {
                        enrollmentService.enrollStudent(s, c);
                        System.out.println("Student enrolled successfully.");
                    } else {
                        System.out.println("Invalid Student ID or Course ID.");
                    }
                    break;

                case 4:
                    studentService.viewAllStudents();
                    break;

                case 5:
                    courseService.viewAllCourses();
                    break;

                case 6:
                    enrollmentService.viewAllEnrollments();
                    break;

                case 7:
                    running = false;
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
