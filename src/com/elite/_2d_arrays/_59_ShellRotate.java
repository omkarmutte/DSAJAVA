package com.elite._2d_arrays;

import java.util.Scanner;

public class _59_ShellRotate {
    static Scanner scn = null; // global declaration of Scanner object

    public static void display(int[][] arr) {
        // display logic
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static int[][] fillArrayWithElements(int r, int c) {
        scn = new Scanner(System.in);
        int[][] temp = new int[r][c];
        // logic
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter (" + i + "," + j + ") element : ");
                temp[i][j] = Integer.parseInt(scn.nextLine());
            }
        }

        return temp;
    }

    public static void shellRotate(int[][] arr, int s, int k) {
        // 1st part
        int[] oned = fillOnedArrayFromShell(arr, s);
        // 2nd part
        rotate(oned, k);
        // 3rd part
        fillShellWithOned(arr, s, oned);

    }

    public static int[] fillOnedArrayFromShell(int[][] arr, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;
        int size = 2 * (maxr - minr + maxc - minc);
        int[] oned = new int[size];

        int idx = 0;
        // lw
        for (int i = minr, j = minc; i <= maxr && idx < size; i++) {
            oned[idx] = arr[i][j];
            idx++;
        }
        // bw
        for (int i = maxr, j = minc + 1; j <= maxc && idx < size; j++) {
            oned[idx] = arr[i][j];
            idx++;
        }
        // rw
        for (int i = maxr - 1, j = maxc; i >= minr && idx < size; i--) {
            oned[idx] = arr[i][j];
            idx++;
        }
        // tw
        for (int i = minr, j = maxc - 1; j >= minc && idx < size; j--) {
            oned[idx] = arr[i][j];
            idx++;
        }

        return oned;
    }
    public static void rotate(int[] oned, int k) {
        k = k % oned.length;
        if (k < 0) {
            k = k + oned.length;
        }
        // a b c | d e
        // part - 1 : a b c => 0 to oned.length - k - 1
        reverse(oned, 0, oned.length - k - 1);
        // part - 2 : d e   => oned.length - k to arr.length - 1
        reverse(oned, oned.length - k, oned.length - 1);
        // part - 3 : c b a e d => 0 to arr.length - 1
        reverse(oned, 0, oned.length - 1);

    }
    public static void reverse(int[] oned, int li, int ri) {
        while (li < ri) {
            int temp = oned[li];
            oned[li] = oned[ri];
            oned[ri] = temp;
            li++;
            ri--;
        }
    }

    public static void fillShellWithOned(int[][] arr, int s, int[] oned) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        int idx = 0;
        // lw
        for (int i = minr, j = minc; i <= maxr; i++) {
            arr[i][j] = oned[idx];
            idx++;
        }
        minc = minc + 1;
        // bw
        for (int i = maxr, j = minc; j <= maxc; j++) {
            arr[i][j] = oned[idx];
            idx++;
        }
        // rw
        maxr = maxr - 1;
        for (int i = maxr, j = maxc; i >= minr; i--) {
            arr[i][j] = oned[idx];
            idx++;
        }
        // tw
        maxc = maxc - 1;
        for (int i = minr, j = maxc; j >= minc; j--) {
            arr[i][j] = oned[idx];
            idx++;
        }

    }

    public static void main(String[] args) {
        scn = new Scanner(System.in);
        System.out.print("Enter row value for an array : ");
        int r = Integer.parseInt(scn.nextLine());
        System.out.print("Enter column value for an array : ");
        int c = Integer.parseInt(scn.nextLine());
        int[][] arr = fillArrayWithElements(r, c);
        System.out.println();
        display(arr);
        // taking shell value
        System.out.print("Enter shell number which you want to rotate : ");
        int s = Integer.parseInt(scn.nextLine());
        System.out.print("Enter rotation value : ");
        int k = Integer.parseInt(scn.nextLine());

        shellRotate(arr, s, k);

        System.out.println();
        display(arr);
    }
}
