package com.elite.base;

import java.util.Scanner;

public class _37_AnyBaseToAnyBase {
    public static int anyBaseToDecimal(int n, int b1) {
        int rv = 0;
        int p = 1;
        // logic
        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            rv += r * p;
            p *= b1;
        }
        return rv;
    }

    public static int decimaltoAnyBase(int dec, int b2) {
        int rv = 0;
        int p = 1;
        // logic
        while (dec > 0) {
            int r = dec % b2;
            dec = dec / b2;
            rv += r * p;
            p *= 10;
        }
        return rv;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = Integer.parseInt(scn.nextLine());
        System.out.print("Enter base for a number : ");
        int b1 = Integer.parseInt(scn.nextLine());
        System.out.print("Enter base in which you wanted to convert a givne number : ");
        int b2 = Integer.parseInt(scn.nextLine());

        System.out.println(n+" present in base "+b1+" wanted to covert it into base "+b2);
        System.out.println();
        // anyBaseToDecimal :: converting n present in base b1 into decimal first
        int decimalVal = anyBaseToDecimal(n, b1);

        // decimalToAnyBase :: then convert that decimalVal into base b2
        int ans = decimaltoAnyBase(decimalVal, b2);

        System.out.println("ans : " + ans);

    }
}
