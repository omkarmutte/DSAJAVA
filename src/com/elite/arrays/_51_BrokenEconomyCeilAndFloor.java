package com.elite.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _51_BrokenEconomyCeilAndFloor {
    // calCeailAndFloor :: This method takes array and data as an input and calculate ceil and floor for that existing data
    public static void calCeilAndFloor(int[] arr, int data) {
        // logic
        int lo = 0;
        int hi = arr.length - 1;
        int ceil = 0;
        int floor = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (data > arr[mid]) {
                lo = mid + 1;
                floor = arr[mid];
            } else if (data < arr[mid]) {
                hi = mid - 1;
                ceil = arr[mid];
            } else {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }// while
        System.out.println("ceil for given " + data + " is : " + ceil);
        System.out.println("floor for given " + data + " is : " + floor);

    }// calCeilAndFloor
    public static void main(String[] args) {
        // input
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = Integer.parseInt(scn.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + " element : ");
            arr[i] = Integer.parseInt(scn.nextLine());
        }

        // sorting the array by using Arrays.sort() method becoz binary search algorithm only works for sorted array ...
        Arrays.sort(arr);
        System.out.print("Enter data : ");
        int data = Integer.parseInt(scn.nextLine());

        // calCeilAndFloor for existing data
        calCeilAndFloor(arr, data);
    }
}
