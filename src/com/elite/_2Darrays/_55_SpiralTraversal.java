package com.elite._2Darrays;

import java.util.Scanner;

public class _55_SpiralTraversal {
    // spiralTraversalDisplay() :: This method takes array as an input and display traversed output
    public static void spiralTraversal(int[][] arr) {
        // logic
        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        
        // controller 
        int tne = arr.length * arr[0].length; 
        // else take r and c as an input parameter 
        // int tne = r * c;
        int cnt = 0;

        while (cnt < tne) {
            // left wall -> represented by min column
            for (int i = minr, j = minc; i <= maxr && cnt < tne; i++) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            minc++;
            // bottom wall -> represented by max row
            for (int i = maxr, j = minc; j <= maxc && cnt < tne; j++) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxr--;
            // right wall -> represented by max column
            for (int i = maxr, j = maxc; i >= minr && cnt < tne; i--) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxc--;
            // top wall -> represented by min row
            for (int i = minr, j = maxc; j >= minc && cnt < tne; j--) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            minr++;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // taking input for an array
        System.out.print("Enter row value for array : ");
        int r = Integer.parseInt(scn.nextLine());
        System.out.print("Enter column value for array : ");
        int c = Integer.parseInt(scn.nextLine());

        int[][] arr = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("Enter (" + i + "," + j + ") element : ");
                arr[i][j] = Integer.parseInt(scn.nextLine());
            }
        }
        //printing before SpiralTraversal
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("tne : "+r * c);
        // calling
        spiralTraversal(arr);

    }
}
