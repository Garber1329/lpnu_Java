package com.company.Task3;

public class Task3 {
    public static void main(String[] args) {
        Subject subject1 = new Subject("OOP");
        Subject subject2 = new Subject("English");

        Rating rating1 = new Rating("5");
        Rating rating2 = new Rating("4");

        Student student1 = new Student("Ivan", "Ivanov", rating1, subject1);
        Student student2 = new Student("Sasha", "Protsaylo", rating2, subject2);

        System.out.println(student1);
        System.out.println(student2);

    }
}
