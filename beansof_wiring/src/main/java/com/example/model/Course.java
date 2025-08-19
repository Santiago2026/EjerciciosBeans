package com.example.model;

public class Course {
    
    private String id;
    private String name;
    private String professor;


    public Course() {
    }
    public Course(String id, String name, String professor) {
        this.id = id;
        this.name = name;
        this.professor = professor;
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
    public String getProfessor() {
        return professor;
    }
    public void setProfessor(String professor) {
        this.professor = professor;
    }
    

}
