package com.elite.string$stringbuffer$andstringbuilder;

import java.util.Scanner;

public class _62_PrintAllPalindromicString {
    public static boolean isPalindromicString(String substring) {
        int i = 0;
        int j = substring.length() - 1;
        while (i <= j) {
            if (substring.charAt(i) != substring.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
    public static void palindromicstring(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (isPalindromicString(str.substring(i, j))) {
                    System.out.println(str.substring(i, j));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String str = scn.nextLine();

        palindromicstring(str);
    }
}
