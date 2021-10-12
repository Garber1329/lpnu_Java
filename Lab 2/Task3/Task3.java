package com.company.Task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<Subject> subjects1 = new ArrayList<>();
        subjects1.add(new Subject("English"));
        subjects1.add(new Subject("Maths"));

        List<Rating> rating1 = new ArrayList<>();
        rating1.add(new Rating(4));
        rating1.add(new Rating(3));

        List<Subject> subjects2 = new ArrayList<>();
        subjects2.add(new Subject("Maths"));
        subjects2.add(new Subject("Physic"));

        List<Rating> rating2 = new ArrayList<>();
        rating2.add(new Rating(5));
        rating2.add(new Rating(5));

        Student student1 = new Student("Ivan", "Ivanov", rating1, subjects1);
        Student student2 = new Student("Sasha", "Protsaylo", rating2, subjects2);

        System.out.println(student1.toString());
        System.out.println(student2.toString());

    }
}
