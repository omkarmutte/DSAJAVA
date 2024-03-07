package com.elite.arrays;

import java.util.Scanner;

public class _45_DifferenceOfTwoArrays {
    // differenceOfTwoArrays:: This method takes a1,a2 arrays as an input and finds the difference between them
    public static void differenceOfTwoArrays(int[] a1, int[] a2) {

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of an first array : ");
        int s1 = Integer.parseInt(scn.nextLine());
        int[] a1 = new int[s1];
        // taking inputs for an array 1
        for (int i = 0; i < a1.length; i++) {
            System.out.print("Enter " + i + "th element of an array 1 : ");
            a1[i] = Integer.parseInt(scn.nextLine());
        }

        System.out.print("Enter size of an second array : ");
        int s2 = Integer.parseInt(scn.nextLine());
        int[] a2 = new int[s2];
        // taking inputs for an array 2
        for (int i = 0; i < a2.length; i++) {
            System.out.print("Enter " + i + "th element of an array 1 : ");
            a2[i] = Integer.parseInt(scn.nextLine());
        }

        differenceOfTwoArrays(a1, a2);
    }
}
