package com.elite.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int s = Integer.parseInt(scn.nextLine());
        int[] arr = new int[s];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + " element : ");
            arr[i] = Integer.parseInt(scn.nextLine());
        }

        Arrays.sort(arr);

        // binary search algorithm
        System.out.print("Enter element to search : ");
        int e = Integer.parseInt(scn.nextLine());
        int li = 0;
        int ri = arr.length - 1;
        while (li <= ri) {
            int mid = (li + ri) / 2;
            if (e > arr[mid]) {
                li = mid + 1;
            } else if (e < arr[mid]) {
                ri = mid - 1;
            } else {
                System.out.print(mid);
                break;
            }
        }
    }
}
