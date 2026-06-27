package com.durga;

public class Pattern35 {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Print numbers and spaces
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print(j + " "); // Print numbers at edges
                } else {
                    System.out.print("  "); // Print spaces in between
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
