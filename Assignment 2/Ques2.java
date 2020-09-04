package com.company;

import java.util.*;
public class Main {
    public static void countSort(int[] arr, int n) {
        int[] count = new int[31];
        for(int x: arr) {
            count[x]++;
        }
        for(int i=1;i<31;i++) {
            count[i] += count[i-1];
        }
        int[] output = new int[n];
        for(int i=0;i<n;i++) {
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<n;i++) arr[i] = output[i];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        countSort(arr, n);
        for(int x: arr) System.out.print(x + " ");
    }
}
