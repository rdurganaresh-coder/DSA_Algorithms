package com.durga;

public class Pattern49 {
    public static void main(String[] args) {
        int n = 9; // Maximum number in the first row

        // Upper half
        for (int i = 0; i < n / 2 + 1; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // Print numbers with stars
            for (int j = 1; j <= n - 2 * i; j++) {
                System.out.print(j);
                if (j < n - 2 * i) {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

        // Lower half
        for (int i = n / 2 - 1; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // Print numbers with stars
            for (int j = 1; j <= n - 2 * i; j++) {
                System.out.print(j);
                if (j < n - 2 * i) {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}

// 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9  
//   1 * 2 * 3 * 4 * 5 * 6 * 7  
//     1 * 2 * 3 * 4 * 5  
//       1 * 2 * 3  
//           1  
//       1 * 2 * 3  
//     1 * 2 * 3 * 4 * 5  
//   1 * 2 * 3 * 4 * 5 * 6 * 7  
// 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9  
