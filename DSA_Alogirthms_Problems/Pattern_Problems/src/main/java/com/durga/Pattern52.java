package com.durga;

public class Pattern52 {
    public static void main(String[] args) {
        int n = 5; // Size of the pattern

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print numbers at the diagonals
                if (j == i || j == n - i + 1) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                // Print numbers at the diagonals
                if (j == i || j == n - i + 1) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("  ");
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
