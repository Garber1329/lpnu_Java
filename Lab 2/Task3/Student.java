package com.company.Task3;

import java.util.List;

public class Student {
    private final String firstName;
    private final String lastName;
    private List<Rating> rating;
    private List<Subject> subjects;

    public Student(String firstName, String lastName, List<Rating> rating, List<Subject> subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rating = rating;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student: " + firstName +
                " " + lastName +
                ", subject: " + subjects +
                ", rating: " + rating +
                '.';
    }

}
