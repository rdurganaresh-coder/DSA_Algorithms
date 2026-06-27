package com.durga.numericPatterns;

public class Pattern22 {
    public static void main(String[] args) {
        int n = 9; // Size of the pattern (odd number for symmetry)

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print '*' when the row and column indices are equal (diagonal 1)
                // or their sum equals n - 1 (diagonal 2)
                if (i == j || i + j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print spaces elsewhere
                }
            }
            System.out.println();
        }
    }
}

// *               *
//   *           *
//     *       *
//       *   *
//         *
//       *   *
//     *       *
//   *           *
// *               *
