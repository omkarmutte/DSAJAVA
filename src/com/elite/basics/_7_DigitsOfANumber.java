package com.elite.basics;

import java.util.Scanner;

public class _7_DigitsOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // input
        System.out.print("Enter a number : ");
        int n = Integer.parseInt(scn.nextLine());

        // number of digits logic
        int temp = n;
        int nod = 0;

        while (temp > 0) {
            temp = temp / 10;
            nod++;
        }

        int div = (int) Math.pow(10, nod - 1);
        // forward print logic
        while (div > 0) {
            int q = n / div;
            int r = n % div;
            System.out.println(q);
            n = r;
            div = div / 10;
        }
    }
}
