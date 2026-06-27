package com.durga.numericPatterns;

public class Pattern39 {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                // Print stars on the borders or at the first row
                if (i == 1 || j == i || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print spaces inside
                }
            }
            System.out.println();
        }
    }
}

// * * * * *
// *     *
// *   *
// * *
// *
