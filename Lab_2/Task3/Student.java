package com.company.Task3;

public class Student {
    private final String firstName;
    private final String lastName;
    private final Rating rating;
    private final Subject subject;

    public Student(String firstName, String lastName, Rating rating, Subject subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rating = rating;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student: " +
                "firstName: " + firstName +
                ", lastName: " + lastName +
                ", rating: " + rating +
                ", subject: " + subject +
                '.';
    }
}
