package com.elite._2d_arrays;

import java.util.Scanner;

public class _57_RotateBy90Degree {
    public static void display(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void transpose(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                char temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void rotate(char[][] arr) {

        transpose(arr);

        for (int i = 0; i < arr.length; i++) {
            int li = 0;
            int ri = arr.length - 1;

            while (li < ri) {
                char temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

                li++;
                ri--;
            }
        }

        display(arr);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter r value : ");
        int r = Integer.parseInt(scn.nextLine());
        System.out.print("Enter c value : ");
        int c = Integer.parseInt(scn.nextLine());
        char[][] arr = new char[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter (" + i + "," + j + ") element : ");
                arr[i][j] = scn.nextLine().charAt(0);
            }
        }

        display(arr);
        rotate(arr);
    }
}
