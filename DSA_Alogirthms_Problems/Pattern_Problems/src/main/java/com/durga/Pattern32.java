package com.durga;

public class Pattern32 {
    public static void main(String[] args) {
        int n = 5; // Number of rows in each half

        // Top half of the sandglass (inverted pyramid)
        for (int i = n; i >= 1; i--) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Bottom half of the sandglass (regular pyramid)
        for (int i = 2; i <= n; i++) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}


// *********
//  ******* 
//   *****  
//    ***   
//     *    
//    ***   
//   *****  
//  ******* 
// *********
