package com.elite.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _52_FirstIndexAndLastIndex {
    // findFirstIndexAndLastIndexOfGivenData :: This method takes array and data as an input and finds the first index and last index for that given data and display it
    public static void findFirstIndexAndLastIndexOfGivenData(int[] arr, int data) {
        // logic
        int fi = 0;
        int li = 0;

        int lo = 0;
        int hi = arr.length - 1;

        // finding fi of an array
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (data > arr[mid]) {
                lo = mid + 1;
            } else if (data < arr[mid]) {
                hi = mid - 1;
            } else {
                fi = mid;
                hi = mid - 1;
            }
        }
        // finding li of an array
        lo = 0;
        hi = arr.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (data > arr[mid]) {
                lo = mid + 1;
            } else if (data < arr[mid]) {
                hi = mid - 1;
            } else {
                li = mid;
                lo = mid + 1;
            }
        } // while

        System.out.println("first index for the data " + data + " is : " + fi);
        System.out.println("last index for the data " + data + " is : " + li);


    } // findFirstIndexAndLastIndexOfGivenData
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
        System.out.print("Enter data : ");
        int data = Integer.parseInt(scn.nextLine());
        findFirstIndexAndLastIndexOfGivenData(arr, data);


    } // main
} // _52_FirstIndexAndLastIndex
