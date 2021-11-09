package com.company.Task3;

public class StudentSimple {
    private String credentials;
    private double avgGrade;

    public StudentSimple(String credentials, double avgGrade) {
        this.credentials = credentials;
        this.avgGrade = avgGrade;
    }

    public StudentSimple() {
        credentials = "";
    }

    public String getCredentials() {
        return credentials;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "StudentSimple{" +
                "credentials='" + credentials + '\'' +
                ", avgGrade=" + avgGrade +
                '}';
    }
}