package com.elite.arrays;

import java.util.Scanner;

public class _44_SumOfTwoArrays {
    // sumOfTwoArrays :: This method taking 2 arrays as an input and making sum of those arrays
    public static void sumOfTwoArrays(int[] a1, int[] a2, int[] sum) {
        // logic
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = sum.length - 1;
        int c = 0;

        while (k >= 0) {
            int d = 0;
            d = d + c;

            if (i >= 0) {
                d = d + a1[i];
            }
            if (j >= 0) {
                d = d + a2[j];
            }
            c =  d / 10;
            d = d % 10;

            sum[k] = d;

            i--;
            j--;
            k--;
        }

        if (c > 0) {
            System.out.print(c+" ");
        }
        for (int val : sum) {
            System.out.print(val + " ");
        }

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // taking inputs
        System.out.print("Enter size of a first array : ");
        int s1 = Integer.parseInt(scn.nextLine());
        int[] a1 = new int[s1];
        for (int i = 0; i < a1.length; i++) {
            System.out.print("Enter " + i + " element : ");
            a1[i] = Integer.parseInt(scn.nextLine());
        }
        System.out.print("Enter size of a second array : ");
        int s2 = Integer.parseInt(scn.nextLine());
        int[] a2 = new int[s2];
        for (int i = 0; i < a2.length; i++) {
            System.out.print("Enter " + i + " element : ");
            a2[i] = Integer.parseInt(scn.nextLine());
        }

        // declaring sum array
        int[] sum = new int[Math.max(s1, s2)]; // Here i am using Math.max() which takes two integer values and returns max between them

        sumOfTwoArrays(a1, a2, sum);

    } // main
} // _44_SumOfTwoArrays
