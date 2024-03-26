package com.elite.patterns;

import java.util.Scanner;

public class _25_Pattern_11_ {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = Integer.parseInt(scn.nextLine());

        // logic
        int val = 1;

        for (int i = 1; i <= n; i++) {
            // printing values
            for (int j = 1; j <= i; j++) {
                System.out.print(val+"\t");
                val++;
            }
            System.out.println();
        }
    }
}
