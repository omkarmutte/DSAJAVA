package com.elite.patterns;

import java.util.Scanner;

public class _28_Pattern_15_ {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = Integer.parseInt(scn.nextLine());

        // logic
        int nst = 1;
        int nsp = n/2;
        int val = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");
            }
            int ival = val;
            for (int j = 1; j <= nst; j++) {
                System.out.print(ival + "\t");
                if(j <= nst/2) {
                    ival++;
                } else {
                    ival--;
                }
            }
            if(i <= n/2) {
                val++;
                nsp--;
                nst+=2;
            } else {
                val--;
                nsp++;
                nst-=2;
            }
            System.out.println();
        }
    }
}
