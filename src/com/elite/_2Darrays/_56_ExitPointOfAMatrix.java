package com.elite._2Darrays;

import java.util.Scanner;

public class _56_ExitPointOfAMatrix {
    public static void display(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // exitPointOfAMatrix :: This method takes array as an input [array having only 0's and 1's] and finds the exit point of a matrix
    public static void exitPointOfAMatrix(int[][] arr) {
        // logic
        int dir = 0; // 0 -> e | 1 -> s | 2 -> w | 3 -> n
        int i = 0;
        int j = 0;

        while (true) {
            // controller
            dir = (dir + arr[i][j]) % 4;

            if (dir == 0) {  // east:  j++
                j++;
            } else if (dir == 1) { // south: i++
                i++;
            } else if (dir == 2) { // west:  j--
                j--;
            } else if (dir == 3) { // north: i--
                i--;
            }

            if (i < 0) {
                i++;
                break;
            } else if (j < 0) {
                j++;
                break;
            } else if (i == arr.length) {
                i--;
                break;
            } else if (j == arr[0].length) {
                j--;
                break;
            }
        }
        System.out.println("exit position of matrix is : ("+i+","+j+")");
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // taking input for an array
        System.out.print("Enter row value of a array : ");
        int r = Integer.parseInt(scn.nextLine());
        System.out.print("Enter column value of a array : ");
        int c = Integer.parseInt(scn.nextLine());

        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter (" + i + "," + j + ") element : ");
                arr[i][j] = Integer.parseInt(scn.nextLine());
            }
        }
        // printing array before finding exit point
        display(arr, r, c);

        // calling exitPointOfAMatrix
        exitPointOfAMatrix(arr);
    } // main
} // _56_ExitPointOfAMatrix
