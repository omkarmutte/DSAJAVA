package com.elite._2d_arrays;

import java.util.Scanner;

public class _54_WaveTraversal {
    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    // waveTraversal:: This method takes array as an input and print the elements of that array in wave format line by line
    public static void waveTraversal(int[][] arr) {
        for (int j = 0; j < arr[0].length; j++) {
            if (j % 2 == 0) { // even column : i goes from 0 - arr.length - 1
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i][j]);
                }
            } else { // odd column : i goes from arr.length - 1 to 0
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter row value for array : ");
        int r = Integer.parseInt(scn.nextLine());
        System.out.print("Enter column value for array : ");
        int c = Integer.parseInt(scn.nextLine());
        int[][] arr = new int[r][c];
        // iterate over the array fill the elements
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter ("+i+","+j+") element : ");
                arr[i][j] = Integer.parseInt(scn.nextLine());
            }
        }

        display(arr);
        waveTraversal(arr);
    } // main
} // _54_WaveTraversal
