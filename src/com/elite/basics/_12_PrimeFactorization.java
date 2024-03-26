package com.elite.basics;

import java.util.Scanner;

public class _12_PrimeFactorization {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = Integer.parseInt(scn.nextLine());

        // logic
        for (int div = 2; div * div <= n; div++) {
            while(n % div == 0) {
                System.out.println(div+" | "+n);
//                System.out.println(div);
                n = n / div;
            }
        }
        if(n > 0) {
            System.out.println(n);
        }

    }
}
