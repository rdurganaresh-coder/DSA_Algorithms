package com.durga;

public class Pattern56 {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        int maxNum = 2 * n - 1; // Maximum number in a row

        // Upper part of the hourglass
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= maxNum; j++) {
                if (j == 1 || j == maxNum || j == i + 1 || j == maxNum - i) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Lower part of the hourglass
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 1; j <= maxNum; j++) {
                if (j == 1 || j == maxNum || j == i + 1 || j == maxNum - i) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

// 1 2 3 4 5 6 7 8 9
// 1       5       9
// 1   4       6   9
// 1 3           7 9
// 1 2 3 4 5 6 7 8 9
