package com.durga;

public class Pattern51{

public static void main(String[] args) {
        int n = 5; // Number of rows in the upper half

        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }

            // Print first number
            System.out.print(1);

            // Print spaces inside the diamond
            if (i > 1) {
                for (int j = 1; j < 2 * (i - 1); j++) {
                    System.out.print("  ");
                }
                // Print last number in the row
                System.out.print(i);
            }

            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }

            // Print first number
            System.out.print(1);

            // Print spaces inside the diamond
            if (i > 1) {
                for (int j = 1; j < 2 * (i - 1); j++) {
                    System.out.print("  ");
                }
                // Print last number in the row
                System.out.print(i);
            }

            System.out.println();
        }
    }
}

//         1        
//       1   2      
//     1       3    
//   1           4  
// 1               5
//   1           4  
//     1       3    
//       1   2      
//         1        
