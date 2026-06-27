package com.durga.numericPatterns;

public class Pattern43 {
    public static void main(String[] args) {
        int n = 5; // Size of the square

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print '*' at the borders and diagonals
                if (i == 1 || i == n || j == 1 || j == n || i == j || j == (n - i + 1)) {
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
// * *   * *  
// *   *   *  
// * *   * *  
// * * * * *  
