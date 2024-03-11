package com.elite.arrays;

import java.util.Scanner;
/*
In this question you are given an array you need to print all subset's of an array
Example : abc
Subset : Formula : Math.pow(2,arr.length-1); -> Math.pow(2,3); => 8
          - - -
          - - c
          - b -
          - b c
          a - -
          a - c
          a b -
          a b c
*/
public class _50_SubsetOfArray {
    // printAllSubsetForAnArray :: This method takes array as an input and prints all subsets for that array
    public static void printAllSubsetForAnArray(int[] arr) {
        // logic
        int limit = (int) Math.pow(2, arr.length);

        for (int i = 0; i < limit; i++) {
            int temp = i; // temp is used instead of i
            String set = "";
            for (int j = arr.length - 1; j >= 0; j--) {
                int r = temp % 2;
                temp = temp / 2;

                if (r == 0) {
                    set = "-" + " "+ set;
                } else {
                    set = arr[j] + " " + set;
                }
            }
            System.out.println(set);
        }
     } // printAllSubsetForAnArray
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = Integer.parseInt(scn.nextLine());
        int[] arr = new int[size];
        // taking input elements for an array
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + " element : ");
            arr[i] = Integer.parseInt(scn.nextLine());
        }

        // calling printAllSubsetForAnArray Method
        printAllSubsetForAnArray(arr);

    } // main
} // _50_SubsetOfArray class
