package com.elite.basics;

import java.util.Scanner;

public class _3_IsANumberPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("\tWelcome to prime number checker");
        System.out.println("========================================");
        System.out.print("Enter how many values you have : ");
        int nov = Integer.parseInt(scn.nextLine());
        int[] primeArray = new int[nov];

        for (int i = 0; i < nov; i++) {
            System.out.print("Enter "+(i+1)+" value : ");
            int n = Integer.parseInt(scn.nextLine());
            primeArray[i] = n;
        }

        // checking each value is it prime or not
        for (int n : primeArray) {
            boolean flag = true;
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(n + " is prime");
            } else {
                System.out.println(n + " is not prime");
            }

        }

    }
}
