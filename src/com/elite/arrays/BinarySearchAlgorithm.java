package com.elite.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchAlgorithm {
    // findDataPresentInArrayUsingBinarySearch:: This method is taking array and data as an input and discovers/finds the data present in which index in given array by using binary search technique.
    public static int findDataPresentInArrayUsingBinarySearch(int[] arr, int data) {
        // logic
        int idx = -1;
        int li = 0;
        int ri = arr.length - 1;
        while (li <= ri) {
            int mid = (li + ri) / 2;
            if (data > arr[mid]) {
                li = mid + 1;
            } else if (data < arr[mid]) {
                ri = mid - 1;
            } else {
                idx = mid;
                break;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = Integer.parseInt(scn.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + " element : ");
            arr[i] = Integer.parseInt(scn.nextLine());
        }
        // Binary Search Algorithm only works for sorted array for sorting the array we having a pre-defined method called sort() present in one of the pre-defined class called "Arrays" signature of this method is
        // public static int[] sort(int [] arr);
        Arrays.sort(arr);

        // input
        System.out.print("\nEnter the data : ");
        int data = Integer.parseInt(scn.nextLine());

        int idx = findDataPresentInArrayUsingBinarySearch(arr, data);
        System.out.println("The given " + data + " present in " + idx + " position..");
    } // main
} // BinarySearchAlgorithm
