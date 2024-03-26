package com.elite.patterns;

import java.util.Scanner;

public class _29_Pattern_16_ {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = Integer.parseInt(scn.nextLine());

        int nst = 1;
        int nsp = 2*n - 3;

        // logic
        for (int i = 1; i <= n; i++) {
            int val = 1;
            for (int j = 1; j <= nst; j++) {
                System.out.print(val+"\t");
                val++;
            }
            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");
            }
            if(i == n) {
                nst--;
                val--;
            }
            for (int j = 1; j <= nst; j++) {
                val--;
                System.out.print(val+"\t");
            }
            nst++;
            nsp-=2;
            System.out.println();
        }
    }
}
