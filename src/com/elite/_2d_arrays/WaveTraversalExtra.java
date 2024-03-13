package com.elite._2d_arrays;

import java.util.Scanner;

public class WaveTraversalExtra {
    public static void waveTraversal(int[][] arr) {

        System.out.println("\nDisplaying the array in wave format ..\n");

        // logic
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.println(arr[i][j]);
                }
            } else {
                for (int j = arr[0].length - 1; j >= 0; j--) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Taking the input for an array
        System.out.print("Enter row value for array : ");
        int r = Integer.parseInt(scn.nextLine());
        System.out.print("Enter column value for array : ");
        int c = Integer.parseInt(scn.nextLine());
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter (" + i + "," + j + ") element : ");
                arr[i][j] = Integer.parseInt(scn.nextLine());
            }
        }
        // printing existing array
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        // calling waveTraversal()
        waveTraversal(arr);
    } // main
} // WaveTraversalExtra
