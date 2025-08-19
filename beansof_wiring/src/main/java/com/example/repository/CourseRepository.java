package com.example.repository;


import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.example.model.Course;

@Repository
public class CourseRepository {
    
    private ArrayList<Course> courses = new ArrayList<>();

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }
}
