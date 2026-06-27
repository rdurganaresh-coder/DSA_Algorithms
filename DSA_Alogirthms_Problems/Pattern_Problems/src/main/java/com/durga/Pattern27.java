package com.durga;

public class Pattern27 {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the upper half

        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print numbers in ascending order
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print numbers in descending order
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print numbers in ascending order
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print numbers in descending order
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}


//         1
//       1 2 1
//     1 2 3 2 1
//   1 2 3 4 3 2 1
// 1 2 3 4 5 4 3 2 1
//   1 2 3 4 3 2 1
//     1 2 3 2 1
//       1 2 1
//         1
