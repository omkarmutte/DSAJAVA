package com.elite.basics;

import java.util.Scanner;

public class _13_PythagoranTriplate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter 1st side of triangle : ");
        double a = Double.parseDouble(scn.nextLine());
        System.out.print("Enter 2nd side of triangle : ");
        double b = Double.parseDouble(scn.nextLine());
        System.out.print("Enter 3rd side of triangle : ");
        double c = Double.parseDouble(scn.nextLine());

        // finding max side of triangle
        double max = a;
        if (b >= max) {
            max = b;
        }
        if (c >= max) {
            max = c;
        }

        if (a == max) {
            boolean isTriplet = (a * a) == (b * b + c * c);
            System.out.println(isTriplet ? "is pythagoran triplet" : "is not pythagoran triplet");
        } else if (b == max) {
            boolean isTriplet = (b * b) == (a * a + c * c);
            System.out.println(isTriplet ? "is pythagoran triplet" : "is not pythagoran triplet");
        } else {
            boolean isTriplet = (c * c) == (b * b + a * a);
            System.out.println(isTriplet ? "is pythagoran triplet" : "is not pythagoran triplet");
        }

    }
}
