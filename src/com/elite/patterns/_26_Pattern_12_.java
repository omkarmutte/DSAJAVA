package com.elite.patterns;

import java.util.Scanner;

public class _26_Pattern_12_ {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = Integer.parseInt(scn.nextLine());

        // logic
        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            // printing values
            for (int j = 1; j <= i; j++) {
                System.out.print(a + "\t");
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}
