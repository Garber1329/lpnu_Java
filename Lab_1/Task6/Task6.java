package com.company.Task6;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        final Scanner sc=new Scanner(System.in);
        System.out.println("Number of rows of the first matrix:");
        final int n=sc.nextInt();
        System.out.println("The number of columns in the first matrix and the number of rows in the second matrix:");
        final int m=sc.nextInt();
        System.out.println("Number of columns in the second matrix:");
        final int k=sc.nextInt();
        final int Maze[][]=new int[n][m];
        final int Maze1[][]=new int[m][k];
        final int Maze2[][]=new int[n][k];
        System.out.println("Matrix 1 input:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                Maze[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix 2 input:");
        for(int i=0;i<m;i++){
            for(int j=0;j<k;j++) {
                Maze1[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++) {
            for(int u=0;u<k;u++) {
                for(int j=0;j<m;j++) {
                    Maze2[i][u]+=Maze[i][j]*Maze1[j][u];
                }
            }
        }

        System.out.println("Matrix 1:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%4d", Maze[i][j]);
            }
            System.out.println();
        }

        System.out.println("Matrix 2:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                System.out.printf("%4d", Maze1[i][j]);
            }
            System.out.println();
        }

        System.out.println("Derivation of matrix multiplication:");
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++) {
                System.out.printf("%4d", Maze2[i][j]);
            }
            System.out.println();
        }
    }
}
