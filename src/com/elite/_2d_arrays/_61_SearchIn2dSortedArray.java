package com.elite._2d_arrays;

import java.util.Scanner;

public class _61_SearchIn2dSortedArray {
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

    public static void searchIn2dSortedArray(int[][] arr, int data) {
        // loigc
        int i = 0;
        int j = arr[0].length - 1;
        while (i < arr.length && j >= 0) {
            if (data > arr[i][j]) {
                i++;
            } else if (data < arr[i][j]) {
                j--;
            } else {
                System.out.println("found at (" + i + "," + j + ")");
                return;
            }
        }
        System.out.println("not found");
    }
    public static void main(String[] args) {
        scn = new Scanner(System.in);
        System.out.print("Enter row value for an array : ");
        int r = Integer.parseInt(scn.nextLine());
        System.out.print("Enter column value for an array : ");
        int c = Integer.parseInt(scn.nextLine());
        int[][] arr = fillArrayWithElements(r, c);

        display(arr);
        System.out.print("Enter data which you want to search : ");
        int data = Integer.parseInt(scn.nextLine());
        searchIn2dSortedArray(arr, data);
    }
}
