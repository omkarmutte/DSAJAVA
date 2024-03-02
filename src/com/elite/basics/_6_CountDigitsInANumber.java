package com.elite.basics;

import java.util.Scanner;

public class _6_CountDigitsInANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // input
        System.out.print("Enter a number : ");
        int n = Integer.parseInt(scn.nextLine());

        // logic
        int nod = 0;

        while (n > 0) {
            int q = n / 10;
            nod++;
            n = q;
        }

        System.out.println("nod in given number is : " + nod);
    }
}
