package com.elite._2Darrays;

import java.util.Scanner;

public class IntoductionTo2Darrays {
    public static void main(String[] args) {
        // input
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter row value : ");
        int r = Integer.parseInt(scn.nextLine());
        System.out.print("Enter column value : ");
        int c = Integer.parseInt(scn.nextLine());

        // declaring 2-D arrays
        int[][] arr = new int[r][c];

        // taking individual elements for the positions of an array
        /*for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter (" + i + "," + j + ") element : ");
                arr[i][j] = Integer.parseInt(scn.nextLine());
            }
        }

        // printing the output
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }*/

        // Method-2 For taking input for 2-D Array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("Enter (" + i + "," + j + ") element : ");
                arr[i][j] = Integer.parseInt(scn.nextLine());
            }
        }
        // Method-2 For displaying the values in 2-D Array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }


        // taking the inputs for the array
//        int[][] arr2 = new int[2][3];
//        arr2[0][0] = 11;
//        arr2[0][1] = 12;
//        arr2[0][2] = 13;
//        arr2[1][0] = 21;
//        arr2[1][1] = 22;
//        arr2[1][2] = 23;
//        System.out.println(arr2[0][0]);

    }
}
