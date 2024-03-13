package com.elite._2Darrays;

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
    public static void display(int[][] prod) {
        for (int i = 0; i < prod.length; i++) {
            for (int j = 0; j < prod[0].length; j++) {
                System.out.print(prod[i][j] + "   ");
            }
            System.out.println();
        }
    }
    // matrixMultiplication:: This method takes 2 arrays as an input create one more array which holes the multiplication output of other array
    public static void matrixMultiplication(int[][] a1, int[][] a2, int r1, int c1, int r2, int c2) {
        // logic
        int[][] prod = new int[r1][c2];
        // iterating over each individual element of prod 2-d array
        for (int i = 0; i < prod.length; i++) {
            for (int j = 0; j < prod[0].length; j++) {
                for (int k = 0; k < c1; k++) {
                    prod[i][j] += a1[i][k] * a2[k][j];
                }
            }
        }

        display(prod);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // input for first array
        System.out.print("Enter row value for 1st array : ");
        int r1 = Integer.parseInt(scn.nextLine());
        System.out.print("Enter column value for 1st array : ");
        int c1 = Integer.parseInt(scn.nextLine());
        System.out.print("Enter row value for 2nd array : ");
        int r2 = Integer.parseInt(scn.nextLine());
        System.out.print("Enter column value for 2nd array : ");
        int c2 = Integer.parseInt(scn.nextLine());
        int[][] a1 = new int[r1][c1];
        int[][] a2 = new int[r2][c2];

        // validating whether multiplication is possible or not
        if (c1 != r2) {
            System.out.println("Invalid input!");
            return;
        }
        // taking input values to fill a1 array
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print("Enter (" + i + "," + j + ") element for first array : ");
                a1[i][j] = Integer.parseInt(scn.nextLine());
            }
        }
        // taking input values to fill a2 array
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print("Enter (" + i + "," + j + ") element for second array : ");
                a2[i][j] = Integer.parseInt(scn.nextLine());
            }
        }

        // calling matrixMultiplication() method
        matrixMultiplication(a1, a2, r1, c1, r2, c2);

    }
}
