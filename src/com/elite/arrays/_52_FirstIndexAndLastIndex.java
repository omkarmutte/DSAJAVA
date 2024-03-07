package com.elite.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _52_FirstIndexAndLastIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = Integer.parseInt(scn.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + " element : ");
            arr[i] = Integer.parseInt(scn.nextLine());
        }
        // sorting an array
        Arrays.sort(arr);

        System.out.print("Enter value to find first index and last index of it : ");
        int data = Integer.parseInt(scn.nextLine());
        int firstIndex = 0;
        int  lastIndex = 0;

        // logic -> for finding firstIndex
        int li = 0;
        int ri = arr.length - 1;
        while (li <= ri) {
            int mid = (li + ri) / 2;
            if (data > arr[mid]) {
                li = mid + 1;
            } else if (data < arr[mid]) {
                ri = mid - 1;
            } else {
                firstIndex = mid;
                ri = mid - 1;
            }
        } // while

        // logic -> for finding lastIndex
        // logic
        li = 0;
        ri = arr.length - 1;

        while (li <= ri) {
            int mid = (li + ri) / 2;
            if (data > arr[mid]) {
                li = mid + 1;
            } else if (data < arr[mid]) {
                ri = mid - 1;
            } else {
                lastIndex = mid;
                li = mid + 1;
            }
        } // while

        System.out.println("first index for " + data + " is : "+firstIndex);
        System.out.println("last index for " + data + " is : "+lastIndex);
    } // main
} // _52_FirstIndexAndLastIndex
