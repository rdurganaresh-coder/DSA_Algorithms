package com.durga.numericPatterns;

public class Pattern30 {
    public static void main(String[] args) {
        int n = 5; // Total number of rows in the top half

        // Top half of the hourglass
        for (int i = n; i >= 1; i--) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Print stars and spaces
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // Bottom half of the hourglass
        for (int i = 2; i <= n; i++) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Print stars and spaces
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}


// *********
//  *     *
//   *   *
//    * *
//     *
//    * *
//   *   *
//  *     *
// *********
