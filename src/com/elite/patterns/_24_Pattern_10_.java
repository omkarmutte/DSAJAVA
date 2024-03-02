package com.elite.patterns;

import java.util.Scanner;

public class _24_Pattern_10_ {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = Integer.parseInt(scn.nextLine());

        // logic
        int osp = n/2;
        int isp = -1;

        for (int i = 1; i <= n; i++) {
            // printing outer spaces
            for (int j = 1; j <= osp; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            // printing inner spaces
            for (int j = 1; j <= isp; j++) {
                System.out.print("\t");
            }
            if (i > 1 && i < n) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                osp--;
                isp+=2;
            } else {
                osp++;
                isp-=2;
            }
            System.out.println();
        }
    }
}
