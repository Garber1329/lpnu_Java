package com.company.Task9;

public class Task9 {
    public static void main(final String[] args) {
        final Calculator calculator = new Calculator();

        System.out.println();
        System.out.println("Select one of four actions: +, -, /, *.");
        System.out.println();
        System.out.println("Result: " + calculator.calculate(42.7,8.8,'/'));
        System.out.println();
    }
}
