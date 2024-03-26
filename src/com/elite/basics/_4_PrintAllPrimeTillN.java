package com.elite.basics;

import java.util.Scanner;

public class _4_PrintAllPrimeTillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter low value : ");
        int low = Integer.parseInt(scn.nextLine());
        System.out.print("Enter high value : ");
        int high = Integer.parseInt(scn.nextLine());

        // checking weather a given number between low - high is prime or not
        for (int i = low; i <= high; i++) {
            boolean isPrime = true;
            for (int div = 2; div * div <= i; div++) {
                if (i % div == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i + " is prime");
            } else {
                System.out.println(i + " is not prime");
            }
        }
    }
}
