package com.elite._2d_arrays;

import java.util.Scanner;
/*
Question ::
1. You have given a number r1, representing the number of rows of 1st Matrix
2. You have given a number c1, representing the number of columns of 1st Matrix
3. You are given r1*c1 numbers, representing elements of 2d array a1.
4. You are given a number r2, representing the number of rows of 2nd Matrix
5. You are given a number c2, representing the number of columns of 2nd Matrix.
6. You are given r2*c2 numbers, representing elements of 2d array a2.
7. If the two arrays representing two matrices of dimensions r1*c1 and r2*c2 can be multiplied, display the content of prd array as specified in output format.

Input format::
A number r1
A number c1
A number r2
A number c2
// Taking input for first array
e00
e01
e02..
// Takint input for secound array
e00
e01
e02 ..

output format::
e11  e12  e13 ..
e21  e22  e23 ..

Constraints : .. kuch

*/

public class _53_MatrixMultiplication {
    static Scanner scn = null;
    public static void display(int[][] arr) {
        // displaying array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] fillArrayWithValues(int r, int c) {
        scn = new Scanner(System.in);

        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter (" + i + "," + j + ") element : ");
                arr[i][j] = Integer.parseInt(scn.nextLine());
            }
        }
        return arr;
    }

    public static void matrixMultiplication(int[][] a1, int[][] a2) {
        // logic
        int[][] prod = new int[a1[0].length][a2.length];
        for (int i = 0; i < prod.length; i++) {
            for (int j = 0; j < prod[0].length; j++) {
                for (int k = 0; k < a2.length; k++) {
                    prod[i][j] += a1[i][k] * a2[k][j];
                }
            }
        }
        System.out.println();
        System.out.println("Matrix Multiplication Result..");
        display(prod);
    }
    public static void main(String[] args) {
        scn = new Scanner(System.in);
        // input for array a1
        System.out.print("Enter row value for array a1 : ");
        int r1 = Integer.parseInt(scn.nextLine());
        System.out.print("Enter column value for array a1 : ");
        int c1 = Integer.parseInt(scn.nextLine());
        System.out.println("Enter values for array a1 : ");
        int[][] a1 = fillArrayWithValues(r1, c1);
        System.out.println();
        display(a1);

        // input for array a2
        System.out.print("Enter row value for array a2 : ");
        int r2 = Integer.parseInt(scn.nextLine());
        System.out.print("Enter column value for array a2 : ");
        int c2 = Integer.parseInt(scn.nextLine());
        System.out.println("Enter values for array a2 : ");
        int[][] a2 = fillArrayWithValues(r2, c2);
        System.out.println();
        display(a2);

        // calling matrixMultiplication() method
        matrixMultiplication(a1, a2);
    }
}
