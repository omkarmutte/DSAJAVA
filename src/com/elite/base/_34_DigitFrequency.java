package com.elite.base;

import java.util.Scanner;

public class _34_DigitFrequency {
    public static int digitFrequency(int n, int d) {
        int frq = 0;
        // logic
        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            if (r == d) {
                frq++;
            }
        }
        return frq;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = Integer.parseInt(scn.nextLine());
        System.out.print("Enter a digit : ");
        int d = Integer.parseInt(scn.nextLine());

        int ans = digitFrequency(n,d);
        System.out.println(d+" occurs "+ans+" times in "+n);
    }
}
