package com.elite.basics;

import java.util.Scanner;

public class _8_ReverseOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = Integer.parseInt(scn.nextLine());

        // logic
        while (n > 0) {
            int r = n % 10;
            System.out.println(r);
            n = n / 10;
        }
    }
}
