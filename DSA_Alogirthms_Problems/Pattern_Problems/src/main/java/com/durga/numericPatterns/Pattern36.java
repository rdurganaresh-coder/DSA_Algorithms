package com.durga.numericPatterns;

public class Pattern36 {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the top half

        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Print stars and spaces
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* "); // Print stars at boundaries
                } else {
                    System.out.print("  "); // Print spaces in between
                }
            }

            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Print stars and spaces
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* "); // Print stars at boundaries
                } else {
                    System.out.print("  "); // Print spaces in between
                }
            }

            System.out.println();
        }
    }
}

//     *    
//    * *   
//   *   *  
//  *     * 
// *       *
//  *     * 
//   *   *  
//    * *   
//     *    
