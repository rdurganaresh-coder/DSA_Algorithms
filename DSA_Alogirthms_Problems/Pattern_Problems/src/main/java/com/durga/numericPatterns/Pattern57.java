package com.durga.numericPatterns;

public class Pattern57 {
     public static void main(String[] args)
     {

        int n = 5; // Number of rows
        int maxStars = 2 * n - 1; // Maximum number of stars in a row

        // Upper part of the hourglass
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= maxStars; j++) {
                if (j == 1 || j == maxStars || j == i + 1 || j == maxStars - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Lower part of the hourglass
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 1; j <= maxStars; j++) {
                if (j == 1 || j == maxStars || j == i + 1 || j == maxStars - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

// * * * * * * * * *
// *       *       *
// *   *       *   *
// * *           * *
// * * * * * * * * *
