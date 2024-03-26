package com.elite.arrays;

import java.util.Scanner;

public class _41_SpanofArray {
    // findSpanofAnArray :: This method takes array as an input and calculate span of that array and return it
    public static int findSpanofAnArray(int[] arr) {
        int span = 0;

        // logic to find span of an array
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        span = max - min;

        return span;
    }

    public static void main(String[] args) {
        // taking the inputs
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int n = Integer.parseInt(scn.nextLine());

        // declaring and initializing the array
        int[] arr = new int[n];
        // storing the values into array by taking inputs from user
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + "th element of an array : ");
            arr[i] = Integer.parseInt(scn.nextLine());
        }

        // calling findSpanofAnArray method
        int span = findSpanofAnArray(arr);
        System.out.println("span of an given array is : " + span);
    }
}
