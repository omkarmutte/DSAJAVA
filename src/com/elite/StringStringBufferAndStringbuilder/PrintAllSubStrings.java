package com.elite.StringStringBufferAndStringbuilder;

import java.util.Scanner;

public class PrintAllSubStrings {
    public static void substring(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String str = scn.nextLine();

        substring(str);
    }
}
