package com.elite.arrays;

import java.util.Scanner;

public class _42_FindElementInAnArray {
    // findElementInAnArray :: This method takes array and element as an input looks that element present in which position in that array and returns a index.
    public static int findElementInAnArry(int[] arr, int e) {
        int idx = -1;
        // logic
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == e) {
                idx = i;
                break;
            }
        }

        return idx;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // taking the input
        System.out.print("Enter size of an array : ");
        int size = Integer.parseInt(scn.nextLine());
        // declaring and initializing the array
        int[] arr = new int[size];
        // taking input values for an arry
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + "th element of an array : ");
            arr[i] = Integer.parseInt(scn.nextLine());
        }
        // taking input for a looking element
        System.out.print("Enter element value : ");
        int e = Integer.parseInt(scn.nextLine());

        int idex = findElementInAnArry(arr, e);
        System.out.println("given element " + e + " present in position " + idex);
    }
}
