package com.elite.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _51_BrokenEconomyCeilAndFloor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int s = Integer.parseInt(scn.nextLine());
        int[] arr = new int[s];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + " element : ");
            arr[i] = Integer.parseInt(scn.nextLine());
        }

        System.out.print("Enter data to find ceil and floor for it : ");
        int data = Integer.parseInt(scn.nextLine());
        // for freshers, you need to understand that binary search algorithm only should work on sorted array
        Arrays.sort(arr);

        int ceil = 0;
        int floor = 0;
        int li = 0;
        int ri = arr.length - 1;

        while (li <= ri) {
            int mid = (li + ri) / 2;
            if (data > arr[mid]) {
                li = mid + 1;
                floor = arr[mid];
            } else if (data < arr[mid]) {
                ri = mid - 1;
                ceil = arr[mid];
            } else {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }

        System.out.println("ceil : " + ceil);
        System.out.println("floor : " + floor);
    }
}
