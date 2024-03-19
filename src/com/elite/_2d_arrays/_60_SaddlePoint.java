package com.elite._2d_arrays;

import java.util.Scanner;

public class _60_SaddlePoint {
    static Scanner scn = null;

    public static void display(int[][] arr) {
        // logic
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] fillArrayWithElements(int r, int c) {
        scn = new Scanner(System.in);
        int[][] temp = new int[r][c];
        // logic
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter (" + i + "," + j + ") element : ");
                temp[i][j] = Integer.parseInt(scn.nextLine());
            }
        }
        return temp;
    }

    public static void saddlePoint(int[][] arr) {
        // This method finds lest in row and max in column
        for (int i = 0; i < arr.length; i++) {
            int spj = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] < arr[i][spj]) {
                    spj = j;
                }
            }

            boolean flag = true;
            for (int k = 0; k < arr.length; k++) {
                if (arr[k][spj] > arr[i][spj]) {
                    flag = false;
                }
            }

            if (flag == true) {
                System.out.println("saddle point : " + arr[i][spj]);
            }
        }


    }

    public static void main(String[] args) {
        scn = new Scanner(System.in);
        System.out.print("Enter row value for an array : ");
        int r = Integer.parseInt(scn.nextLine());
        System.out.print("Enter column value for an array : ");
        int c = Integer.parseInt(scn.nextLine());
        int[][] arr = fillArrayWithElements(r, c);

        display(arr);
        System.out.println();
        saddlePoint(arr);
    }
}
