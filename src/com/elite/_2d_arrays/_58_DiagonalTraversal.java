package com.elite._2d_arrays;

import java.util.Scanner;

public class _58_DiagonalTraversal {
    static Scanner scn = null;

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static int[][] fillArrayWithElements(int r, int c) {
        scn = new Scanner(System.in);
        int[][] temp = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter (" + i + "," + j + ") element : ");
                temp[i][j] = Integer.parseInt(scn.nextLine());
            }
        }

        return temp;
    }

    public static void digonalTraversal(int[][] arr) {
        // logic
        for (int d = 0; d < arr.length; d++) {
            for (int i = 0, j = d; i < arr.length && j < arr[0].length; i++, j++) {
                System.out.print(arr[i][j] + "  ");
            }
        }
    }
    public static void main(String[] args) {
        scn = new Scanner(System.in);
        System.out.print("Enter r value : ");
        int r = Integer.parseInt(scn.nextLine());
        System.out.print("Enter c value : ");
        int c = Integer.parseInt(scn.nextLine());
        int[][] arr = new int[r][c];
        arr = fillArrayWithElements(r, c);

        display(arr);
        System.out.println();
        digonalTraversal(arr);
    }
}
