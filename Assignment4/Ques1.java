package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();
        String[] crops = new String[N];
        for (int i = 0; i < N; i++) {
            crops[i] = sc.nextLine().trim();
        }
        String[] crops1 = new String[N];
        if (N >= 0) System.arraycopy(crops, 0, crops1, 0, N);
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < crops[0].length(); j++) {
                if (creatingProblem(crops, i, j)) {
                    crops[i] = crops[i].substring(0, j) + getPossibleChar(crops, i, j) + crops[i].substring(j + 1);
                    count++;
                }
            }
        }
        int count1 = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < crops1[0].length(); j++) {
                if (creatingProblem(crops1, i, j) || makingTriangle(crops1, i, j)) {
                    crops1[i] = crops1[i].substring(0, j) + getPossibleChar(crops1, i, j) + crops1[i].substring(j + 1);
                    count1++;
                }
            }
        }
        System.out.println(Math.min(count, count1));
    }

    private static boolean makingTriangle(String[] crops, int row, int col) {
        return (row + 1 < crops.length && crops[row].charAt(col) == crops[row + 1].charAt(col)) &&
                (col + 1 < crops[0].length() && crops[row].charAt(col) == crops[row].charAt(col + 1));
    }

    private static char getPossibleChar(String[] crops, int row, int col) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (check(crops, ch, row, col)) return ch;
        }
        return 'z';
    }

    private static boolean check(String[] crops, char ch, int row, int col) {
        boolean up = true, bottom = true, right = true, left = true;
        if (row - 1 >= 0) left = ch != crops[row - 1].charAt(col);
        if (col - 1 >= 0) up = ch != crops[row].charAt(col - 1);
        if (row + 1 < crops.length) bottom = ch != crops[row + 1].charAt(col);
        if (col + 1 < crops[0].length()) right = ch != crops[row].charAt(col + 1);
        return up && bottom && right && left;
    }

    private static boolean creatingProblem(String[] crops, int row, int col) {
        boolean up = false, left = false;
        if (row - 1 >= 0) left = (crops[row].charAt(col) == crops[row - 1].charAt(col));
        if (col - 1 >= 0) up = (crops[row].charAt(col) == crops[row].charAt(col - 1));
        return up || left;
    }
}
