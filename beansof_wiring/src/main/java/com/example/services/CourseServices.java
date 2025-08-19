package com.example.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.repository.CourseRepository;
import com.example.repository.StudentRepository;



@Service
public class CourseServices {

    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private StudentRepository studentRepository;

    public CourseServices(CourseRepository courseRepository, StudentRepository studentRepository) {
        this.courseRepository = courseRepository;
        this.studentRepository = studentRepository;
    }
    

    
}


//Relacion de agregacion con CourseRepository porque si muere CourseServices, CourseRepository no se ve afectado.