package com.airtribe.studentmanagement.service;

import com.airtribe.studentmanagement.entity.Course;
import java.util.ArrayList;
import java.util.List;

public class CourseService {

    private List<Course> courses = new ArrayList<>();

    public boolean addCourse(Course course) {

        if (course.getCourseId() <= 0) {
            System.out.println("Course ID must be greater than 0.");
            return false;
        }

        for (Course existing : courses) {
            if (existing.getCourseId() == course.getCourseId()) {
                System.out.println("Course with this ID already exists.");
                return false;
            }
        }

        courses.add(course);
        return true;
    }

    public void viewAllCourses() {

        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }

        for (Course course : courses) {
            System.out.println(
                    "Course ID: " + course.getCourseId() +
                            ", Course Name: " + course.getCourseName());
        }
    }

    public List<Course> getAllCourses() {
        return courses;
    }

    public Course getCourseById(int courseId) {
        for (Course course : courses) {
            if (course.getCourseId() == courseId) {
                return course;
            }
        }
        return null;
    }
}
