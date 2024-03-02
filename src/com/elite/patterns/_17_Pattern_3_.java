package com.elite.patterns;

import java.util.Scanner;

public class _17_Pattern_3_ {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = Integer.parseInt(scn.nextLine());

        int nsp = n - 1;
        int nst = 1;

        for (int i = 1; i <= n; i++) {
            // space printing
            for(int j = 1; j <= nsp; j++) {
                System.out.print("\t");
            }
            // start printing
            for (int j = 1; j <= nst; j++) {
                System.out.print("*\t");
            }
            nsp--;
            nst++;
            System.out.println();
        }
    }
}
