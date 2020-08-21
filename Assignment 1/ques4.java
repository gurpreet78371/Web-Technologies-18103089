package com.company;
import java.util.Scanner;
import java.util.*;
public class Main{
    public static String sortString(String str) {
        char[] tempArray = str.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1;
        str1 = sc.nextLine();
        String str2;
        str2 = sc.nextLine();
        str2 = sortString(str2);
        str1 = sortString(str1);
        if (!str2.equals(str1)) {
            System.out.println("Strings are not anagrams");
        } else {
            System.out.println("Both strings are anagrams");
        }
    }
}
