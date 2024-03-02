package com.elite.patterns;

import java.util.Scanner;

public class _32_Pattern_19_ {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = Integer.parseInt(scn.nextLine());

        // logic
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (i == 1) {

                    if (j == 1 || j >= n / 2 + 1) {
                        System.out.print("*  ");
                    } else {
                        System.out.print("   ");
                    }

                } else if (i < n / 2 + 1) {

                    if (j == 1 || j == n / 2 + 1) {
                        System.out.print("*  ");
                    } else {
                        System.out.print("   ");
                    }

                } else if (i == n / 2 + 1) {
                    System.out.print("*  ");

                } else if (i < n) {
                    if (j == n / 2 + 1 || j == n) {
                        System.out.print("*  ");
                    } else {
                        System.out.print("   ");
                    }

                } else {

                    if (j <= n / 2 + 1 || j == n) {
                        System.out.print("*  ");
                    } else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }
}
