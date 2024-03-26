package com.elite.patterns;

import java.util.Scanner;

public class _21_Pattern_7_ {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = Integer.parseInt(scn.nextLine());

        // logic
        int nsp = 0;
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");
            }
            nsp++;
            System.out.println("*\t");
        }
    }
}
