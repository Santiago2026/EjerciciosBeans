package com.example.repository;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.example.model.Student;


@Repository
public class StudentRepository {
    
    private ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void initRepo(){
        students.add(new Student("1", "Melissa", "11"));
        students.add(new Student("2", "Valen","11"));
        students.add(new Student("3", "Santiago", "11"));

    }



}
