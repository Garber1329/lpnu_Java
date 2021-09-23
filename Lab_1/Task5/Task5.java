package com.company.Task5;
import java.util.Scanner;
public class Task5 {
    public static void main(final String[] args) {

        final int n = 5, m = 3;
        final int a [][] = {{9,4,5},{2,5,7},{4,3,7},{7,1,0},{5,9,7}};

        System.out.println("Before");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < m; j++) {
                final int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        System.out.println("After");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }

    }
}
