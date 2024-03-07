package com.elite.arrays;

import java.util.Scanner;

/*
    This question takes array as an input and inverse it
    like : given array -> 4 0 2 1 3
                       -> 0 1 2 3 4
    output : reversed array -> 1 3 2 4 0
                               0 1 2 3 4
*/
public class _47_InverseOfAnArray {
    // display:: This method display the content of an array
    public static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    // inverseofAnArray:: This method takes given array as an input make it inverse and call display function for printing
    public static void inverseofAnArray(int[] arr) {
        // here freshers make mistake you need to make new array and store the values into it because if we try to change existing array it will collapse and don't create valid answers
        int[] inv = new int[arr.length];
        // before inverse printing
        System.out.print("before inverse : ");
        display(arr);
        // logic for inverse an array
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            inv[val] = i;
        }
        // after inverse printing
        System.out.println();
        System.out.print("after inverse : ");
        display(inv);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = Integer.parseInt(scn.nextLine());
        int[] arr = new int[size];
        // taking inputs
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + " element : ");
            arr[i] = Integer.parseInt(scn.nextLine());
        }

        // calling inverseofAnArray method
        inverseofAnArray(arr);
    }
}
