package com.elite.patterns;

import java.util.Scanner;

public class _20_Pattern_6_ {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = Integer.parseInt(scn.nextLine());

        // logic
        int nst = n/2 + 1;
        int nsp = 1;
        for (int i = 1; i <= n; i++) {
//            System.out.print(nst+","+nsp+","+nst);
            for (int j = 1; j <= nst; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                nst--;
                nsp+=2;
            } else {
                nst++;
                nsp-=2;
            }
            System.out.println();
        }

    }
}
