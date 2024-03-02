package com.elite.patterns;

import java.util.Scanner;

public class _33_Pattern_20_ {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = Integer.parseInt(scn.nextLine());

        // logic

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n) {
                    System.out.print("*\t");
                } else if (i >= n/2 + 1) {
                    if (i == j || i + j == n + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else {
                    System.out.print("\t");
                } // else
            }// for
            System.out.println();
        }// for
    }// main
}// class
