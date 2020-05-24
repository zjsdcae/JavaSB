package com.example.freeMarker.model;

public class Student {
    private Integer id;
    private String strudentName;
    private double grade;

    public Student(Integer id, String strudentName, double grade) {
        this.id = id;
        this.strudentName = strudentName;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getStrudentName() {
        return strudentName;
    }

    public void setStrudentName(String strudentName) {
        this.strudentName = strudentName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
