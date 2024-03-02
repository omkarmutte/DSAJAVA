package com.elite.base;

import java.util.Scanner;

public class _38_AnyBaseAddition {
    // anyBaseAddition :: taking two numbers additing them and returning
    public static int anyBaseAddition(int b, int n1, int n2) {
        int rv = 0;
        int c = 0;
        int p = 1;
        // logic
        while (n1 > 0 || n2 > 0 || c > 0) {
            int r1 = n1 % 10;
            int r2 = n2 % 10;

            n1 = n1 / 10;
            n2 = n2 / 10;

            int d = r1 + r2 + c;

            c = d / b;
            d = d % b;

            rv+= d * p;

            p *= 10;
        }

        return  rv;
     }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter base for numbers : ");
        int b = Integer.parseInt(scn.nextLine());
        System.out.print("Enter 1st number prsent in " + b + " base : ");
        int n1 = Integer.parseInt(scn.nextLine());
        System.out.print("Enter 2nd number prsent in " + b + " base : ");
        int n2 = Integer.parseInt(scn.nextLine());

        int ans = anyBaseAddition(b, n1, n2);
        System.out.println("addition of " + n1 + " and " + n2 + " in base " + b + " is : " + ans);

    }
}
