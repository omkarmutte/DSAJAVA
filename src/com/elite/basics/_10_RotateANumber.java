package com.elite.basics;

import java.util.Scanner;

public class _10_RotateANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = Integer.parseInt(scn.nextLine());
        System.out.print("Enter rotation value : ");
        int k = Integer.parseInt(scn.nextLine());

        // we need multiplayer and divisor for this logic
        int nod = 0;
        int temp = n;
        while (temp > 0) {
            temp = temp / 10;
            nod++;
        }
        k = k % nod;
        if (k < 0) {
            k = k + nod;
        }
        int div = 1;
        int mul = 1;
        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                div = div * 10;
            } else {
                mul = mul * 10;
            }
        }
        System.out.println("div : " + div + " | " + "mul : " + mul);
        int q = n / div;
        int r = n % div;
        int ans = q + r * mul;
        System.out.println("after rotating by "+k+" the number becomes : "+ans);
    }
}
