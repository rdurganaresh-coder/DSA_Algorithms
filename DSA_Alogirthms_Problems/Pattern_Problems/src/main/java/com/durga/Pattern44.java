package com.durga;

public class Pattern44 {
    public static void main(String[] args) {
        int n = 5; // Size of the square

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print numbers at the borders and diagonals
                if (i == 1 || i == n || j == 1 || j == n || i == j || j == (n - i + 1)) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  "); // Print spaces inside
                }
            }
            System.out.println();
        }
    }
}

// 1 2 3 4 5  
// 1 2   4 5  
// 1   3   5  
// 1 2   4 5  
// 1 2 3 4 5  
