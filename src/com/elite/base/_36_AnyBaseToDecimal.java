package com.elite.base;

import java.util.Scanner;

public class _36_AnyBaseToDecimal {
    // this method taking a number n in base b and converting it into decimal
    public static int anyBaseToDecimal(int n, int b) {
        int rv = 0;
        int p = 1;
        // logic
        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            rv += r * p;
            p *= b;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = Integer.parseInt(scn.nextLine());
        System.out.print("Enter base for a number : ");
        int b = Integer.parseInt(scn.nextLine());

        int ans = anyBaseToDecimal(n, b);
        System.out.println(n + " value in base " + b + " is converted into decimal value : " + ans);
    }
}
