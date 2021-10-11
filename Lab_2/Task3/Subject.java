package com.company.Task3;

public class Subject {
    private String subjectName;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return subjectName;
    }
}
