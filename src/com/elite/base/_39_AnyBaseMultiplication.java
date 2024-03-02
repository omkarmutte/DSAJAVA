package com.elite.base;

// FileName : _39_AnyBaseMultiplication.java
// ClassName : _39_AnyBaseMultiplication

import java.util.Scanner;

public class _39_AnyBaseMultiplication {

    // anyBaseMultiplication :: This method takes base, number1 and number2. multiply it in base b and return it
    public static int anyBaseMultiplication(int b, int n1, int n2) {
        int rv = 0;
        // logic
        int p = 1;
        while (n2 > 0) {
            int r2 = n2 % 10;
            n2 = n2 / 10;
            int sprd = getSingleDigitMultiplication(b, n1, r2);
            rv = getSumInBaseB(b, rv, sprd * p);
            p *= 10;
        }
        return rv;
    }

    // getSingleDigitMultiplication :: This method taking base,n1 and single digit of an n2, multiply that single digit of n2 with n1 and return it
    public static int getSingleDigitMultiplication(int b, int n1, int d2) {
        int rv = 0;
        // logic
        int p = 1;
        int c = 0;
        while (n1 > 0 || c > 0) {
            int r1 = n1 % 10;
            n1 = n1/10;
            int d = r1 * d2 + c;
            c = d / b;
            d = d % b;
            rv += d * p;
            p *= 10;
        }

        return rv;
    }

    // getSumINBaseB :: This method takes base, rv and sprd add rv + sprd and return it
    public static int getSumInBaseB(int b, int n1, int n2) {
        int rv = 0;
        // logic
        int p = 1;
        int c = 0;
        while (n1 > 0 || n2 > 0 || c > 0) {
            int r1 = n1 % 10;
            int r2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            int d = r1 + r2 + c;
            c = d / b;
            d = d % b;
            rv += d * p;
            p *= 10;
        }

        return  rv;
    }

    public static void main(String[] args) {
        // taking the inputs
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter base in which you are providing a numbers : ");
        int b = Integer.parseInt(scn.nextLine());
        System.out.print("Enter 1st number in " + b + " base : ");
        int n1 = Integer.parseInt(scn.nextLine());
        System.out.print("Enter 2nd number in " + b + " base : ");
        int n2 = Integer.parseInt(scn.nextLine());

        int ans = anyBaseMultiplication(b, n1, n2);
        System.out.println("multiplication of (" + n1 + "," + n2 + ") in base " + b + " is : " + ans);
    }
}
