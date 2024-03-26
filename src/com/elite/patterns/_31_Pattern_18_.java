package com.elite.patterns;

import java.util.Scanner;

public class _31_Pattern_18_ {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = Integer.parseInt(scn.nextLine());

        // logic
        int nst = n;
        int nsp = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= nst; j++) {
                if(i > 1 && i < n/2 + 1 && j > 1 && j < nst) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }

            if (i <= n / 2) {
                nsp++;
                nst-=2;
            } else {
                nsp--;
                nst+=2;
            }
            System.out.println();
        }
    }
}
