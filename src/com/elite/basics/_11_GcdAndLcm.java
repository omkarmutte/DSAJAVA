package com.elite.basics;

import java.util.Scanner;

public class _11_GcdAndLcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter FNO : ");
        int n1 = Integer.parseInt(scn.nextLine());
        System.out.print("Enter SNO : ");
        int n2 = Integer.parseInt(scn.nextLine());

        /*GCD is the largest part of the prime factorization that two numbers have in common.
        /LCM is the smallest number that has all the prime factors from both numbers and no other factors*/
        int on1 = n1;
        int on2 = n2;

        while (n1 % n2 != 0) {
            int r = n1 % n2;
            n1 = n2;
            n2 = r;
        }

        int gcd = n2;
        int lcm = (on1 * on2) / gcd;

        System.out.println("gcd : " + gcd);
        System.out.println("lcm : " + lcm);

    }
}
