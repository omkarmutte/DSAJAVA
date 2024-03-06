package com.elite.arrays;

import java.util.Scanner;

public class _43_BarChart {
    // findMaxSizeBuilding :: This method takes buldings array as an input and returns the biggest building size
    public static int findMaxSizeBuilding(int[] buldings) {
        int max = buldings[0];
        // logic
        for (int i = 0; i < buldings.length; i++) {
            if (buldings[i] >= max) {
                max = buldings[i];
            }
        }

        return max;
    }
    // printBarChart :: taking buildings array as an input and printing * if size of building >= floor else printing -
    public static void printBarChart(int[] buldings, int maxFloor) {
        // logic
        for (int floor = maxFloor; floor >= 1; floor--) {
            for (int i = 0; i < buldings.length; i++) {
                if (buldings[i] >= floor) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter how many buildings you have : ");
        int size = Integer.parseInt(scn.nextLine());

        // taking the inputs for each individual buildings
        int[] buildings = new int[size];
        for (int i = 0; i < buildings.length; i++) {
            System.out.print("Enter " + i + " th building : ");
            buildings[i] = Integer.parseInt(scn.nextLine());
        }
        int maxBuildingSize = findMaxSizeBuilding(buildings);
        printBarChart(buildings, maxBuildingSize);
    }
}
