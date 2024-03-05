package com.elite.arrays;

import java.util.Scanner;

public class _40_IntroductionToArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // how do we declare the array ?
        int[] arr; // declaration statement // arr -> 4k
        // how do we assign the array | initialize the array ?
        arr = new int[5]; // this is array having size arr -> [0,0,0,0,0]

//        // how do we store the values into array ?
//        arr[0] = 10; // [10,0,0,0,0]
//        arr[1] = 20; // [10,20,0,0,0]
//        arr[2] = 30; // [10,20,30,0,0]
//        arr[3] = 40; // [10,20,30,40,0]
//        arr[4] = 50; // [10,20,30,40,50]
//
//        // how do we print the values into the array ?
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);

        // how do we store the values into array by using dynamic approch ?
//        System.out.print(arr.length);
        System.out.println("Enter values for an array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(scn.nextLine());
        }

        // how do we display the values stored into array ?
        System.out.println("by using simple for loop i am printing the values into the array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("by using foreach loop i am printing the values into the array : ");
        for(int val : arr) {
            System.out.println(val);
        }
    }
}
