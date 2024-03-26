package com.elite.patterns;

import java.util.Scanner;

public class _19_Pattern_5_ {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = Integer.parseInt(scn.nextLine());

        int nsp = n/2;
        int nst = 1;

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
            if (i <= n / 2) {
                nsp--;
                nst+=2;
            } else {
                nsp++;
                nst-=2;
            }
            System.out.println();
        }
    }
}
