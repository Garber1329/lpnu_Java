package com.company.Task3;

import java.util.List;

public class Student {
    private final int UID;
    private String name;
    private String surName;
    private List<Subject> subjects;
    private double averageGrade;

    public Student(String name, String surName, List<Subject> subjects, int UID) {
        this.UID = UID;
        this.name = name;
        this.surName = surName;
        this.subjects = subjects;
        getAverageGrade();
    }

    public Student(String name, List<Subject> subjects, int UID) {
        this.name = name;
        this.subjects = subjects;
        this.UID = UID;
        getAverageGrade();
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSurName() {
        return surName;
    }

    public int getUID() {
        return UID;
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addSubject(Subject subject) {
        if (subject == null) {
            return false;
        }
        if (subjects.contains(subject)) {
            return false;
        }
        subjects.add(subject);
        getAverageGrade();
        return true;
    }

    public boolean removeSubject(String name) {
        if (name == null) {
            return false;
        }
        for (Subject s : subjects) {
            if (s.getName().equals(name)) {
                subjects.remove(s);
                getAverageGrade();
                return true;
            }
        }
        return false;
    }

    public Double getSubjectGrade(String subjName) throws IllegalArgumentException {
        if (subjName == null) {
            throw new IllegalArgumentException("subject can`t be null!!!");
        }
        for (Subject s : subjects) {
            if (s.getName().equals(subjName)) {
                return s.getGrade();
            }
        }
        return null;
    }

    public boolean setSubjectGrade(String subjName, double grade) {
        if (subjName == null) {
            return false;
        }
        for (Subject s : subjects) {
            if (s.getName().equals(subjName)) {
                s.setGrade(grade);
                getAverageGrade();
                return true;
            }
        }
        return false;
    }

    public Double getAverageGrade() {
        double gradesSum = 0;

        for (Subject s : subjects) {
            gradesSum += s.getGrade();
        }
        averageGrade = gradesSum / subjects.size();

        return averageGrade;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append(name).append(" : ").append("Average grade : ").append(averageGrade).append(System.lineSeparator())
                .append("Subject grades : ").append(System.lineSeparator());
        for (Subject s : subjects) {
            result.append(s.getName()).append(" : ").append(s.getGrade()).append(System.lineSeparator());
        }

        return result.toString();
    }
}
