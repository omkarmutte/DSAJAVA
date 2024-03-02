package com.elite.basics;

import java.util.Scanner;

public class _14_BenjaminBulbs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Tell me how many bulbs in your house : ");
        int n = Integer.parseInt(scn.nextLine());

        for (int div = 1; div * div <= n; div++) {
            System.out.println(div * div);
        }

    }
}
