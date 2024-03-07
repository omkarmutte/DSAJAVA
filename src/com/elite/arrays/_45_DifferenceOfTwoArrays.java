package com.elite.arrays;

import java.util.Scanner;

public class _45_DifferenceOfTwoArrays {

    // This method is used for displaying the array
    public static void display(int[] diff) {
        // removing leading zeros from array
        int idx = 0;
        while (idx < diff.length) {
            if (diff[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }
        // printing
        while (idx < diff.length) {
            System.out.print(diff[idx] + " ");
            idx++;
        }
    }
    // differenceOfTwoArrays:: This method takes a1,a2 arrays as an input and finds the difference between them
    public static void differenceOfTwoArrays(int[] a1, int[] a2) {
        // logic
        int[] diff = new int[Math.max(a1.length, a2.length)];
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = diff.length - 1;
        int b = 0;

        while (k >= 0) {

            int a1v = i >= 0 ? a1[i] : 0;
            int a2v = j >= 0 ? a2[j] : 0;
            int d = 0;

            if (a1.length > a2.length) {
                if (a1[i] + b >= a2v) {
                    d = a1[i] + b - a2v;
                    b = 0;
                } else {
                    d = a1[i] + 10 + b - a2v;
                    b = -1;
                }
            } else {
                if (a2[j] + b >= a1v) {
                    d = a2[j] + b - a1v;
                    b = 0;
                } else {
                    d = a2[j] + 10 + b - a1v;
                    b = -1;
                }
            }

            diff[k] = d;

            i--;
            j--;
            k--;
        }
        display(diff);
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
