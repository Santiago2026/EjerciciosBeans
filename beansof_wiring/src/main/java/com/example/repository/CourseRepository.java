package com.example.repository;


import java.util.ArrayList;
import com.example.model.Course;

public class CourseRepository {
    
    private ArrayList<Course> courses = new ArrayList<>();

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }
}
