package com.example.services;
import java.util.ArrayList;

import com.example.model.Student;
import com.example.repository.StudentRepository;
import com.example.repository.CourseRepository;

public class StudentServices {
    
    private StudentRepository studentRepository;
    private CourseRepository courseRepository;

    public StudentServices(StudentRepository studentRepository, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    public void addStudent(Student student) {
        if (studentRepository.getStudents().contains(student)){
            System.out.println("Student already exists.");
        } else {
            studentRepository.addStudent(student);
            System.out.println("Student added successfully: " + student.getName());
        }
    }

    public ArrayList<Student> getStudents() {
        return studentRepository.getStudents();
    }

}
