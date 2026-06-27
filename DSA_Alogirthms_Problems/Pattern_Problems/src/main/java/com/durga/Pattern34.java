package com.durga;

public class Pattern34 {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the top half

        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Print numbers and spaces in between
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print(j + " "); // Print number at boundaries
                } else {
                    System.out.print("  "); // Print space in between
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

            // Print numbers and spaces in between
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print(j + " "); // Print number at boundaries
                } else {
                    System.out.print("  "); // Print space in between
                }
            }

            System.out.println();
        }
    }
}

//     1    
//    1 2   
//   1   3  
//  1     4 
// 1       5
//  1     4 
//   1   3  
//    1 2   
//     1    
