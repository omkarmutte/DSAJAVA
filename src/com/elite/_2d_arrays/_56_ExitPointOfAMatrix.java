package com.elite._2d_arrays;

import java.util.Scanner;

public class _56_ExitPointOfAMatrix {
    static Scanner scn = null;

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] finllArrayWithElements(int r, int c) {
        scn = new Scanner(System.in);
        int[][] temp = new int[r][c];
        // taking input
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter (" + i + "," + j + ") element : ");
                temp[i][j] = Integer.parseInt(scn.nextLine());
            }
        }
        return temp;
    }

    public static void exitPointOfAnMatrix(int[][] arr) {
        int i = 0;
        int j = 0;
        int dir = 0;

        while (true) {
            dir = (dir + arr[i][j]) % 4;

            if (dir == 0) { // east
                j++;
            } else if (dir == 1) { // south
                i++;
            } else if (dir == 2) { // west
                j--;
            } else if (dir == 3) { // north
                i--;
            }

            // top wall
            if (i < 0) {
                i++;
                break;
            } else if (j < 0) { // left wall
                j++;
                break;
            } else if (i == arr.length) { // bottom wall
                i--;
                break;
            } else if (j == arr[0].length) { // right wall
                j--;
                break;
            }

        } // while
        System.out.println("Exit point of given matrix is : ("+i+","+ j+")");
    }

    public static void main(String[] args) {
        scn = new Scanner(System.in);
        System.out.print("Enter r value for array : "); // taking input for row
        int r = Integer.parseInt(scn.nextLine());
        System.out.print("Enter c value for array : "); // taking input for column
        int c = Integer.parseInt(scn.nextLine());
        int[][] arr = finllArrayWithElements(r, c);
        display(arr);
        System.out.println();
        // calling exitPointOfAnMatrix
        exitPointOfAnMatrix(arr);
    } // main
} // _56_ExitPointOfAMatrix
