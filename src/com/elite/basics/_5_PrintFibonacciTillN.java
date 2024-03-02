package com.elite.basics;

// FileName : _5_PrintFibonacciTillN.java
// ClassName : _5_PrintFibonacciTillN
import java.util.Scanner;

public class _5_PrintFibonacciTillN {
    public static void main(String[] args) {
        Scanner scn = null;

        while (true) {
            try {
                scn = new Scanner(System.in);
                // taking a input from user
                System.out.print("Enter a number : ");
                int n = Integer.parseInt(scn.nextLine()); //-10
                if (n <= 0) { // -10 <= 0
                    System.out.println("user please enter +ve integer value...");
                } else {
                    // logic
                    int a = 0;
                    int b = 1;

                    for (int i = 0; i < n; i++) {
                        System.out.println(a);
                        int c = a + b;
                        a =b;
                        b = c;
                    }
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter integer value don't try to be smart...");
            } // catch
        }

    }// main
}// class
