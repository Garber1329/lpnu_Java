package com.company.Task4;

public class Task4 {
    public static void main(final String[] args) {
        for (int i=1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz\n");
            } else {
                if (i % 5 == 0) {
                    System.out.print("Buzz\n");
                } else {
                    if (i % 3 == 0){
                        System.out.print("Fizz\n");
                    } else
                        System.out.println(i);
                }

            }

        }
    }
}
