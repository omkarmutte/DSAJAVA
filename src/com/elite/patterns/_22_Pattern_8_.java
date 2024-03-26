package com.elite.patterns;

import java.util.Scanner;

public class _22_Pattern_8_ {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = Integer.parseInt(scn.nextLine());

        // logic
        int nsp = n - 1;
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");
            }
            System.out.println("*\t");
            nsp--;
        }
    }
}
