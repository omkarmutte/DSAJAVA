package com.elite.arrays;

import java.util.Scanner;

/*
In this problem we have an array, what we need to do is printing all subarray's for an array
Example :
array -> abc
subarray's ->
        a
        a b
        a b c

        b
        b c

        c
*/
public class _49_SubarrayProblem {
    // printAllSubArraysForAnArray :: This method takes array as an input and print's all sub arrays for that array
    public static void printAllSubArraysForAnArray(int[] arr) {
        // logic
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = Integer.parseInt(scn.nextLine());
        int[] arr = new int[size];
        // inputs
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + " element : ");
            arr[i] = Integer.parseInt(scn.nextLine());
        }

        printAllSubArraysForAnArray(arr);
    }
}
