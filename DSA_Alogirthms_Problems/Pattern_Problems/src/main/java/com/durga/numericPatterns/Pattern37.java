package com.durga.numericPatterns;

public class Pattern37 {
    public static void main(String[] args) {
        int n = 5; // Size of the cross (must be an odd number)

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print stars at the cross's center and diagonal lines
                if (i == j || i + j == n + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

// *       *
//   *   *  
//     *    
//   *   *  
// *       *
