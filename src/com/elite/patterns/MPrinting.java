package com.elite.patterns;

import java.util.Scanner;

public class MPrinting {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = Integer.parseInt(scn.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n) {
                    System.out.print("*  ");
                } else if (i <= n/2 + 1) {
                    if (i == j || i + j == n + 1) {
                        System.out.print("*  ");
                    } else {
                        System.out.print("   ");
                    }
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
