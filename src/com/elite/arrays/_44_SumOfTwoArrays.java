package com.elite.arrays;

import java.util.Scanner;

public class _44_SumOfTwoArrays {
    public static void display(int[] sum) {
        System.out.println("sum of two input arrays is : ");
        for (int val : sum) {
            System.out.print(val + " ");
        }
    }
    // sumOfAnArray :: This method takes a1,a2 and sum arrays as an input and returns sum array output
    public static void sumOfAnArray(int[] a1, int[] a2, int[] sum) {
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = sum.length - 1;

        int c = 0;

        while (k >= 0) {
            int d = c;
            if (i >= 0) {
                d = d + a1[i];
            }
            if (j >= 0) {
                d = d + a2[j];
            }
            c = d / 10;
            d = d % 10;

            sum[k] = d;

            i--;
            j--;
            k--;
        }
        display(sum);
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

        int[] sum = new int[Math.max(s1, s2)];

        sumOfAnArray(a1, a2, sum);

    }
}
