package com.elite.arrays;

import java.util.Scanner;

/*
This question ::  Having an array of integers, we need to rotate the k elements of an array
Consider our array as :-> 12345
suppose user say's that rotate it by +2 :-> [then you need to move last 2 elements at first] :-> 45123
suppose user say's that rotate it by -3 :-> [then you need to move first 3 elements at last] :-> 45123
*/

public class _48_RotateAnArray {
    // display :: This method prints the output for an array
    public static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void reverseAnArry(int[] arr, int li, int ri) {
        while (li < ri) {
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;
            li++;
            ri--;
        }
    }
    // rotateAnArray :: This method takes array as an input rotate it and call display method to print
    public static void rotateAnArray(int[] arr, int k) {
        // here freshers must know about we need to make changes in existing array only
        // logic // arr : 12345 | k = 2
        k = k % arr.length;
        if (k < 0) {
            k = k + arr.length;
        }
        // 1st Part reverse : 123 | 0 to arr.length - k - 1;
        reverseAnArry(arr, 0, arr.length - k - 1);
        // 2nd part reverse : 45  | arr.length - k to arr.length - 1
        reverseAnArry(arr, arr.length - k, arr.length - 1);
        // whole array reverse : 0 to arr.length - 1
        reverseAnArry(arr, 0, arr.length - 1);

        // calling display method for displaying the values after rotation
        display(arr);
    }
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
        // taking rotating value as input
        System.out.print("\nEnter rotation value : ");
        int k = Integer.parseInt(scn.nextLine());
        // calling rotateAnArray method
        rotateAnArray(arr, k);
    }
}
