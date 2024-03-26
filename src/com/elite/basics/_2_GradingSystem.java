package com.elite.basics;

import java.util.Scanner;

public class _2_GradingSystem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter marks : ");
        double marks = Double.parseDouble(scn.nextLine());
        if(marks > 90) {
            System.out.println("Excellent");
        } else if (marks > 80) {
            System.out.println("Good");
        } else if (marks > 70 ) {
            System.out.println("fair");
        } else if (marks > 60 ) {
            System.out.println("meets expectations");
        } else {
            System.out.println("below par");
        }
    }
}
