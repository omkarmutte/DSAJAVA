package com.elite.base;

import java.util.Scanner;

public class _38_AnyBaseSubtraction {
    // anyBaseSubtraction :: takes base, n1, n2 as input and subtract n2(min) from n1(max) and returns the result.
    public static int anyBaseSubtraction(int base, int n1, int n2) {
        // n1 = max in base b
        // n2 = min in base b
        int p = 1;
        int rv = 0;
        int b = 0;

        while(n1 > 0) {
            int r1 = n1 % 10;
            int r2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int d = 0;
            r1 = r1 + b;
            if (r1 >= r2) {
                b = 0;
                d = r1 - r2;
            } else {
                b = -1;
                d = r1 + base - r2;
            }
            rv += d * p;
            p *= 10;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the base for the numbers you are entering : ");
        int b = Integer.parseInt(scn.nextLine());
        System.out.print("Enter 1st number in " + b + " base : ");
        int n1 = Integer.parseInt(scn.nextLine());
        System.out.print("Enter 2nd number in " + b + " base : ");
        int n2 = Integer.parseInt(scn.nextLine());

        int max = Math.max(n1, n2);
        int min = Math.min(n1, n2);

        int ans = anyBaseSubtraction(b, max, min);
        System.out.println("subtraction result : " + ans);

    }
}
