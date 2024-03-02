package com.elite.patterns;

import java.util.Scanner;

public class _18_Pattern_4_ {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = Integer.parseInt(scn.nextLine());

        int nsp = 0;
        int nst = n;

        // row control
        for (int i = 1; i <= n; i++) {
            // space printing
            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");
            }
            // star printing
            for (int j = 1; j <= nst; j++) {
                System.out.print("*\t");
            }
            nsp++;
            nst--;
            System.out.println();
        }
    }
}
