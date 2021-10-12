package com.company.Task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task4 {
    private List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Task4 t4 = new Task4();
        List<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject("English", 88));
        subjects.add(new Subject("Maths", 75));
        subjects.add(new Subject("Physic", 58));

        List<Subject> subjects2 = new ArrayList<>();
        subjects2.add(new Subject("English", 88));
        subjects2.add(new Subject("Maths", 75));
        subjects2.add(new Subject("Physic", 58));

        Student john = new Student("John", subjects, 1);
        Student bill = new Student("Bill", subjects2, 2);

        t4.students.add(john);
        t4.students.add(bill);

        t4.students.get(0).setSubjectGrade("English", 75);
        t4.students.get(0).setSubjectGrade("Maths", 100);
        t4.students.get(0).setSubjectGrade("Physic", 80);

        t4.students.get(1).setSubjectGrade("English", 75);
        t4.students.get(1).setSubjectGrade("Maths", 50);
        t4.students.get(1).setSubjectGrade("Physic", 40);

        t4.printAllStudents();
        t4.addSubjectToAll(new Subject("History"));
        t4.students.get(0).setSubjectGrade("History", 70);
        t4.students.get(1).setSubjectGrade("History", 55);

        t4.printAllStudents();

        System.out.println("Highest average : " + t4.findGreatestAverageGrade());
        System.out.println(t4.formMap("Maths"));
    }

    private void addSubjectToAll(Subject subject) {
        for(Student s : students) {
            s.addSubject(new Subject(subject.getName(), subject.getGrade()));
        }
    }

    private void printAllStudents() {
        for(Student s : students) {
            System.out.println(s);
        }
    }

    private Student findGreatestAverageGrade() {
        Student result = students.get(0);

        for (Student s : students) {
            if(s.getAverageGrade() > result.getAverageGrade()) {
                result = s;
            }
        }
        return result;
    }

    private Map<Integer,Double> formMap(String subjectName) {
        Map<Integer,Double> result = new HashMap<>();
        try {
            for (Student s : students) {
                result.put(s.getUID(), s.getSubjectGrade(subjectName));
            }
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
