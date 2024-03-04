package com.elite.arrays;

import java.util.Scanner;

public class DifferenceofTwoArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // declaring first array with size given by the user
        System.out.print("Enter size of an first array : ");
        int s1 = Integer.parseInt(scn.nextLine());
        int[] a1 = new int[s1];
        // taking input for first array
        System.out.println("Enter elements for first array separated by sapce : ");
        for (int i = 0; i < a1.length; i++) {
            a1[i] = scn.nextInt();
        }
        scn.nextLine();
        // declaring first array with size given by the user
        System.out.print("Enter size of an secound array : ");
        int s2 = Integer.parseInt(scn.nextLine());
        int[] a2 = new int[s2];
        System.out.println("Enter elements for secound array separated by sapce : ");
        // taking input for secound array
        for (int i = 0; i < a2.length; i++) {
            a2[i] = scn.nextInt();
        }

        int[] diff = new int[Math.max(a1.length, a2.length)];

        // finding maxarray and minarray from given arrays

        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = diff.length - 1;

        int c = 0;
        while (k > 0) {

            int d = 0;
            d = d + c;

            int ival = i >= 0 ? a1[i] : 0;
            int jval = j >= 0 ? a2[j] : 0;

            if (a1.length > a2.length) {
                if (a1[i] >= jval) {
                    c = 0;
                    d = a1[i] - a2[j];
                } else {
                    c = -1;
                    d = a1[i] + 10 - a2[j];
                }

            } else {
                if (a2[j] >= ival) {
                    d = a2[j] - a1[i];
                    c = 0;
                } else {
                    d = a2[j] + 10 - a1[i];
                    c = -1;

                }
            }


            diff[k] = d;

            i--;
            j--;
            k--;
        }

        for (int val : diff) {
            System.out.print(val + " ");
        }


    }
}
