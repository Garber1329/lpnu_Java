package com.company.Task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static List<Student> students = new ArrayList<>();
    public static void main(String[] args) {

        List<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject("English", 88));
        subjects.add(new Subject("Maths", 75));
        subjects.add(new Subject("Physic", 58));

        List<Subject> subjects2 = new ArrayList<>();
        subjects2.add(new Subject("English", 88));
        subjects2.add(new Subject("Maths", 75));
        subjects2.add(new Subject("Physic", 58));

        List<Subject> subjects3 = new ArrayList<>();
        subjects3.add(new Subject("English", 88));
        subjects3.add(new Subject("Maths", 75));
        subjects3.add(new Subject("Physic", 58));

        Student john = new Student("John","jic", subjects, 1);
        Student bill = new Student("Bill","sdf", subjects2, 2);
        Student ivan = new Student("Ivan", "dfs", subjects3, 3);

        Task3 t3 = new Task3();

        t3.students.add(john);
        t3.students.add(bill);
        t3.students.add(ivan);

        t3.students.get(0).setSubjectGrade("English", 75);
        t3.students.get(0).setSubjectGrade("Maths", 100);
        t3.students.get(0).setSubjectGrade("Physic", 80);

        t3.students.get(1).setSubjectGrade("English", 75);
        t3.students.get(1).setSubjectGrade("Maths", 50);
        t3.students.get(1).setSubjectGrade("Physic", 40);

        t3.students.get(2).setSubjectGrade("English", 35);
        t3.students.get(2).setSubjectGrade("Maths", 30);
        t3.students.get(2).setSubjectGrade("Physic", 40);

        t3.printAllStudents();
        System.out.println(t3.simplifyStudents(students) + "\n");
        System.out.println(t3.deleteAvgGradeLessThan(students,50) + "\n");
        System.out.println(t3.distinctSubjectGrades(students, "English") + "\n");
        System.out.println(t3.sortStudentsByCredentials(students) + "\n");
        System.out.println(t3.getBiggestAvgGrade(students) + "\n");
        System.out.println(t3.getSurnamesWithHyphen(students) + "\n");

    }
    private void printAllStudents() {
        for(Student s : students) {
            System.out.println(s);
        }
    }

    public static List<StudentSimple> simplifyStudents(List<Student> students) {
        return students.stream()
                .map(student -> new StudentSimple(student.getUID() + student.getName(),
                        student.getAverageGrade()))
                .collect(Collectors.toList());
    }

    public static List<Student> deleteAvgGradeLessThan(List<Student> students, double borderGrade) {
        return students.stream()
                .filter(student -> student.getAverageGrade() > borderGrade)
                .collect(Collectors.toList());
    }

    public static List<String> distinctSubjectGrades(List<Student> students, String subjectName) {
        return students.stream()
                .map(student -> student.getName() + " : " + subjectName + " : " + student.getSubjectGrade(subjectName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentsByCredentials(List<Student> students) {
        return students.stream()
                .sorted((first, second) -> {
                    return first.getName().compareTo(second.getName()) == 0 ? first.getSurName().compareTo(second.getSurName()) : first.getName().compareTo(second.getName());
                })
                .collect(Collectors.toList());
    }

    public static Student getBiggestAvgGrade(List<Student> students) {
        return students.stream()
                .sorted((first, second) -> second.getAverageGrade().compareTo(first.getAverageGrade()))
                .collect(Collectors.toList()).get(0);
    }

    public static String getSurnamesWithHyphen(List<Student> students) {
//        return students.stream()
//                .map(student -> student.getName() + " -"/* + student.getSurName()*/)
//                .collect(Collectors.toList());
        return students.stream()
                .map(Student::getSurName)
                .reduce((s1, s2) -> s1 + "-" + s2).orElse("No");
    }
}
