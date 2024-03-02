package com.elite.base;

import java.util.Scanner;

public class _35_DecimalToAnyBase {
    // decimaltoAnyBase
    public static int decimaltoAnyBase(int n, int b) {
        int rv = 0;
        int p = 1;
        // logic
        while (n > 0) {
            int r = n % b;
            n = n / b;
            rv += r * p;
            p *= 10;
        }
        return rv;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = Integer.parseInt(scn.nextLine());
        System.out.print("Enter a base value : ");
        int b = Integer.parseInt(scn.nextLine());

        int ans = decimaltoAnyBase(n, b);
        System.out.println(n + " in decimal converted into " + b + " base the ans is : " + ans);


    }
}
