package com.durga;

public class Pattern53 {
    public static void main(String[] args) {
        int n = 5; // Number of rows in each half

        // Upper half of the butterfly
        for (int i = 1; i <= n; i++) {
            // Print first half numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // Print second half numbers in reverse
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        // Lower half of the butterfly
        for (int i = n; i >= 1; i--) {
            // Print first half numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // Print second half numbers in reverse
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}

// 1                 1
// 1 2             2 1
// 1 2 3         3 2 1
// 1 2 3 4     4 3 2 1
// 1 2 3 4 5 5 4 3 2 1
// 1 2 3 4 5 5 4 3 2 1
// 1 2 3 4     4 3 2 1
// 1 2 3         3 2 1
// 1 2             2 1
// 1                 1
