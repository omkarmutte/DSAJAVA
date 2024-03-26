package com.elite.patterns;

import java.util.Scanner;

public class _16_Pattern_2_ {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = Integer.parseInt(scn.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
