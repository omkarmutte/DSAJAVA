package com.elite.basics;

import java.util.Scanner;

public class _9_InverseOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = Integer.parseInt(scn.nextLine());

        // logic
        int op = 1;
        int id = 0;

        while (n > 0) {
            int od = n % 10;
            int ip = od;
            id = id + op * (int)Math.pow(10,ip-1);

            op++;
            n = n / 10;
        }

        System.out.println("inverse digit : " + id);


    }
}
