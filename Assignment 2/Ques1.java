package com.company;

import java.util.*;

public class Main {

    public static int compareTo(String str1, String str2) {
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            if ((int) str1.charAt(i) == (int) str2.charAt(i)) {
                continue;
            } else {
                return (int) str1.charAt(i) - (int) str2.charAt(i);
            }
        }
        if (str1.length() < str2.length()) {
            return (str1.length() - str2.length());
        } else if (str1.length() > str2.length()) {
            return (str1.length() - str2.length());
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int value = compareTo(str1, str2);
        if (value == 0) {
            System.out.println("Both strings are equal");
        } else {
            if (value > 0) {
                System.out.println("'" + str1 + "'" + " > " + "'" + str2 + "'");
            } else {
                System.out.println("'" + str2 + "'" + " > " + "'" + str1 + "'");
            }
        }
    }
}
