package com.elite.StringStringBufferAndStringbuilder;

import java.util.Arrays;

public class IntroductionToStringDS {
    public static void main(String[] args) {
        // NOTE : STRING ARE IMMUTABLE DATA STRUCTURE IN JAVA, MEANING THEIR VALUES CANNOT BE CHANGED ONCE THEY CREATED.
        /*

        // declare a String
        String str;
        // Initialize a String
        str = "Welcome";
        System.out.println("str : " + str + "  |  " + str.hashCode());
        System.out.println();

        // declaration with initialization
        String s1 = "Welcome to java world";
        System.out.println("s1 : " + s1 + "  |  " + s1.hashCode());
        System.out.println();
        // or
        String s2 = new String("Welcome to java world");
        System.out.println("s2 : " + s2 + "  |  " + s2.hashCode());

        // Taking input for String
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String s3 = scn.nextLine();
        System.out.println("s3 : " + s3 + "  |  " + s3.hashCode());

        // NOTE : next() => reads till space separator
        // NOTE : nextLine() => reads till enter
        System.out.print("Enter your string again : ");
        // reading the values w.r.t next() and nextLine() methods
        String s4 = scn.next(); // It reads till space | "java" it reads
        String s5 = scn.nextLine(); // It reads remaining lines from "is to !"
        System.out.println("s4 : " + s4 + "  |  " + s4.hashCode());
        System.out.println("s5 : " + s5 + "  |  " + s5.hashCode());

*/

/*
        // println() method is used for displaying output in string
        String s6 = "welcome1";
        String s7 = "welcome1";
        String s8 = new String("welcome1");
        System.out.println("s6 == s7 : " + (s6 == s7)); // true
        System.out.println("s6.equals(s7) : " + s6.equals(s7)); // true
        System.out.println("s6 == s8 : " + (s6 == s8)); // false -> both are not pointing to same reference
        System.out.println("s6.equals(s8) : " + s6.equals(s8)); // true -> It checks character by character of both string if both string contains same value then it returns true else false.

*/
/*        String s9 = "Hello";
        s9 += " World!";
        System.out.println("s9 : " + s9);
        System.out.println(10 + 20 + "Hello");
        System.out.println("Hello" + 10 + 20);
*/

        // DIFFERENT METHODS IN STRING
        // length() :: returns the length of the string
        String str = "welcome to java world !";
        int length = str.length();
        System.out.println("str.length() : returns the length of the string : " + length);
        // charAt(int idx) :: returns the character at the specified index
        char ch = str.charAt(0);
        System.out.println("str.charAt(0) : returns the character at the specified index : " + ch);
        // concat(String str) : concatenates the specified string to the end of this string
        String str2 = str.concat(" One of the popular language..");
        System.out.println("str.concat(String str) : concatenates the specified string to the end of this string : " + str2);

        // equals(Object obj) : Compares the string to the specified object
        String s1 = "Hello";
        String s2 = "Hello";
        boolean isEqual = s1.equals(s2);// isEqual is true
        System.out.println("s1.equals(s2) : compares the string to the specified object : " + isEqual);

        // equalsIgnoreCase(String anotherString) : Compares this string to another string, ignoring case considerations.
        String s3 = "Hello";
        String s4 = "hello";
        System.out.println("s3.equalsIgnoreCase(s4) : " + s3.equalsIgnoreCase(s4));

        // substring(int beginIndex) : returns a new string that is a substring of this string, starting form the specified index
        System.out.println("str.substring(4) : " + str.substring(4));

        // indexOf(String str) : returns the index within this string of the first occurrence of the specified substring
        System.out.println("str.indexOf(\"java\") : " + str.indexOf("java"));

        // toUpperCase() : converts all character in the string to uppercase
        System.out.println("str.toUpperCase() : " + str.toUpperCase());

        // toLowerCase() : converts all character in this string to lowercase
        String upperCaseString = "HELLO GUYS!";
        System.out.println("upperCaseString.toLowerCase() : " + upperCaseString.toLowerCase());

        // trim() : removes leading and trailing whitespaces character form this string
        String whitespaceString = "       Hello Java World        ";
        System.out.println("whitespaceString.trim() : " + whitespaceString.trim());

        // split(condition|regex) : It splits the string based on the specified regular expression and returns the array of substrings
        String s = "Hello+Java+World+With+Omkar+Sir";
        String[] sString = s.split("\\+");
        Arrays.stream(sString).forEach(System.out::println);


    }
}
