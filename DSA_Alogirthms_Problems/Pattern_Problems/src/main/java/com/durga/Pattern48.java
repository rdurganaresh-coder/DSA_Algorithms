package com.durga;

public class Pattern48 {
    public static void main(String[] args) {
        int n = 4; // Number of rows for each half

        // Upper half of the butterfly
        for (int i = 1; i <= n; i++) {
            // Left half numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Spaces in the middle
            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.out.print("  ");
            }

            // Right half numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        // Lower half of the butterfly
        for (int i = n; i >= 1; i--) {
            // Left half numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Spaces in the middle
            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.out.print("  ");
            }

            // Right half numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}

// 1           1
// 1 2       2 1
// 1 2 3   3 2 1
// 1 2 3 4 3 2 1
// 1 2 3 4 3 2 1
// 1 2 3   3 2 1
// 1 2       2 1
// 1           1
