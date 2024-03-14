package com.elite._2d_arrays;

import java.util.Scanner;

public class _55_SpiralTraversal {
    static Scanner scn = null;

    public static int[][] fillArrayWithElements(int r, int c) {
        scn = new Scanner(System.in);
        int[][] arr = new int[r][c];
        // logic
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter (" + i + "," + j + ") element : ");
                arr[i][j] = Integer.parseInt(scn.nextLine());
            }
        }

        return arr;
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void sprialTraversal(int[][] arr) {

        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;

        int tne = arr.length * arr[0].length;
        int cnt = 0;

        while (cnt < tne) {
            // left wall
            for (int i = minr, j = minc; i <= maxr && cnt < tne; i++) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            minc++;
            // bottom wall
            for (int i = maxr, j = minc; j <= maxc && cnt < tne; j++) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxr--;
            // right wall
            for (int i = maxr, j = maxc; i >= minr && cnt < tne; i--) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxc--;
            // top wall
            for (int i = minr, j = maxc; j >= minc && cnt < tne; j--) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            minr++;
        }

























    }

    public static void main(String[] args) {
        scn = new Scanner(System.in);
        System.out.print("Enter r value for array : ");
        int r = Integer.parseInt(scn.nextLine());
        System.out.print("Enter c value for array : ");
        int c = Integer.parseInt(scn.nextLine());
        int[][] arr = fillArrayWithElements(r, c);
        display(arr);

        // calling sprialTraversal method
        sprialTraversal(arr);

    }
}
