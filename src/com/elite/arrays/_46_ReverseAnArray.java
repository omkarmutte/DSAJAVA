package com.elite.arrays;

import java.util.Scanner;

public class _46_ReverseAnArray {
    // display:: this method display's the elements in an array
    public static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    // reverseArray:: This method takes array as an input and reverse its elements
    public static void reverseArray(int[] arr) {
        // logic
        int li = 0;
        int ri = arr.length - 1;

        while (li < ri) {
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;

            li++;
            ri--;
        }

        display(arr);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = Integer.parseInt(scn.nextLine());
        int[] arr = new int[size];
        // taking input elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + " element : ");
            arr[i] = Integer.parseInt(scn.nextLine());
        }

        // calling reverseArray method
        reverseArray(arr);
    }
}
