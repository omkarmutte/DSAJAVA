package com.elite.arrays;

import java.util.Scanner;

public class _45_DifferenceOfTwoArrays {

    // This method is used for displaying the array
    public static void display(int[] diff) {
        // removing leading zeros
        int idx = 0;
        while (idx < diff.length) {
            if (diff[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }
        // print
        while (idx < diff.length) {
            System.out.print(diff[idx] + " ");
            idx++;
        }
    }

    // subtractionOfTwoArrays:: This method takes a1,a2 and diff arrays as an input and finds the difference between them and store it into diff array
    public static void subtractionOfTwoArrays(int[] a1, int[] a2, int[] diff) {
        // logic
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = diff.length - 1;
        int b = 0;
        while (k >= 0) {
            int d = 0;
            int a1v = i >= 0 ? a1[i] : 0;
            int a2v = j >= 0 ? a2[j] : 0;

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
        // taking the inputs
        System.out.print("Enter size of an array a1 : ");
        int s1 = Integer.parseInt(scn.nextLine());
        int[] a1 = new int[s1];
        for (int i = 0; i < a1.length; i++) {
            System.out.print("Enter " + i + " element for a1 : ");
            a1[i] = Integer.parseInt(scn.nextLine());
        }

        System.out.print("Enter size of an array a2 : ");
        int s2 = Integer.parseInt(scn.nextLine());
        int[] a2 = new int[s2];
        for (int i = 0; i < a2.length; i++) {
            System.out.print("Enter " + i + " element for a1 : ");
            a2[i] = Integer.parseInt(scn.nextLine());
        }

        // initializing the diff array w.r.t s1 and s2 size
        int[] diff = new int[Math.max(s1, s2)];

        // calling
        subtractionOfTwoArrays(a1, a2, diff);
    }

} // _45_DifferenceOfTwoArrays
