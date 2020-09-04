package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Boolean> m = new HashMap<>();
        displayHailstone(n, m);
    }

    private static void displayHailstone(int n, Map<Integer, Boolean> m) {
        System.out.print(n + " ");
        if(m.containsKey(n) || n==1) return;
        m.put(n, true);
        if(n%2==0) displayHailstone(n/2, m);
        if(n>=(Integer.MAX_VALUE-1)/3) return;
        if(n%2!=0) displayHailstone((3*n)+1, m);
    }
}