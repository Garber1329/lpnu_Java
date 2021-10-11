package com.company.Task1;

public class Task1 {
    public static void main(String[] args) {
        Person tom = new Person("Tom");
        tom.display();
        Person sam = new Employee("Sam", "Oracle");
        sam.display();
        Person bob = new Client("Bob", "Monobank", 3000);
        bob.display();
    }
}
