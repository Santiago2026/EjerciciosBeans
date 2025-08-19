package com.example.services;


import com.example.repository.CourseRepository;
import com.example.repository.StudentRepository;




public class CourseServices {

    private CourseRepository courseRepository;
    private StudentRepository studentRepository;

    public CourseServices(CourseRepository courseRepository, StudentRepository studentRepository) {
        this.courseRepository = courseRepository;
        this.studentRepository = studentRepository;
    }
    

    
}


//Relacion de agregacion con CourseRepository porque si muere CourseServices, CourseRepository no se ve afectado.