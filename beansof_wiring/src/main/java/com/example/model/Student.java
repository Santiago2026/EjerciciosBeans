package com.example.model;

public class Student {
    
    private String id;
    private String name;
    private String courseId;

    public Student(){

    }

    public Student(String id, String name, String courseId) {
        this.id = id;
        this.name = name;
        this.courseId = courseId;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            Student student = (Student) o;
            return this.id.equals(student.id);

        }else{
            return false;
        }
    }

}
