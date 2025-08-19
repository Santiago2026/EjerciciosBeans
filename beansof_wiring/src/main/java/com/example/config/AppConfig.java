package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.repository.CourseRepository;
import com.example.repository.StudentRepository;
import com.example.services.CourseServices;
import com.example.services.StudentServices;

@Configuration
public class AppConfig {

    @Bean
    public StudentRepository studentRepository() {
        return new StudentRepository();
    }

    @Bean
    public CourseRepository courseRepository() {
        return new CourseRepository();
    }

    @Bean
    public StudentServices studentServices(StudentRepository studentRepository, CourseRepository courseRepository) {
        return new StudentServices(studentRepository, courseRepository);
    }

    @Bean
    public CourseServices courseServices(CourseRepository courseRepository, StudentRepository studentRepository) {
        return new CourseServices(courseRepository, studentRepository);
    }


    
}
