package com.company;

import java.util.*;
public class Main {
    public static String countSort(char[] arr, int n) {
        int[] count = new int[257];
        for(int i=0;i<n;i++) {
            count[arr[i]]++;
        }
        for(int i=1;i<257;i++) {
            count[i] += count[i-1];
        }
        char[] output = new char[n];
        for(int i=0;i<n;i++) {
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }
        return new String(output);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = countSort(str.toCharArray(), str.length());
        System.out.println(str);
    }
}
