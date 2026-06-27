package com.durga.numericPatterns;

public class Pattern23 {
    public static void main(String[] args) {
        int n = 5; // Number of rows (and the width of the rhombus)

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) 
                System.out.print("  ");

            // Print stars and spaces for hollow rhombus
            for (int j = 1; j <= n; j++) 
                // Print '*' for first or last row, or first/last column
                if (i == 1 || i == n || j == 1 || j == n) 
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            System.out.println();
        }
    }
}


//         * * * * *
//       *       * 
//     *       * 
//   *       * 
// * * * * *
