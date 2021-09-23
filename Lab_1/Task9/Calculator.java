package com.company.Task9;

public class Calculator {
    public Calculator() {
    }

    public double calculate(final int a, final int b, final char operator) {
        switch (operator) {
            case '+' -> {
                return a + b;
            }
            case '-' -> {
                return a - b;
            }
            case '/' -> {
                if (b == 0) {
                    System.out.println("You cannot divide a number by zero!");
                    return 0;
                }
                return  a / b;
            }
            case '*' -> {
                return a * b;
            }
            default -> {
                System.out.println("You have entered an incorrect value! ");
                System.out.println("You must enter the number of the selected menu item");
            }
        }
        return 0;
    }

    public double calculate(final double w, final double q, final char operator) {
        final CustomDouble customDouble = new CustomDouble (w);
        final CustomDouble customDouble1 = new CustomDouble (q);

        switch (operator) {
            case '+':
                return customDouble.sum (customDouble1).toDouble ();
            case '-':
                return customDouble.subtraction (customDouble1).toDouble ();
            case '/':
                if (q == 0) {
                    System.out.println ("You cannot divide a number by zero!");
                    return 0;
                }
                return customDouble.division (customDouble1).toDouble ();

            case '*':
                return   customDouble.multiplication (customDouble).toDouble ();
            default:
                System.out.println ("You have entered an incorrect value! ");
                System.out.println ("You must enter one of four actions: +, -, /, *.");
                return 1;
        }
    }
}
