package com.company.Task4;

public class Subject {
    private String name;
    private double grade;

    public Subject(String name) {
        this.name = name;
    }

    public Subject(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }
}
