package com.durga.numericPatterns;

public class Pattern42 {
    public static void main(String[] args) {
        int n = 5; // Size of the pattern

        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                // Print numbers at the diagonals
                if (j == i || j == (2 * n - i)) {
                    System.out.print((Math.min(i, 2 * n - i)) + " ");
                } else {
                    System.out.print("  "); // Print spaces inside
                }
            }
            System.out.println();
        }
    }
}

// 1       1  
//  2     2   
//   3   3    
//    4 4     
//     5      
//    4 4     
//   3   3    
//  2     2   
// 1       1  
