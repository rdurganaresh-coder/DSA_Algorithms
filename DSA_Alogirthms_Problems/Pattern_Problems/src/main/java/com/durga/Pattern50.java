package com.durga;

public class Pattern50 {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the upper half

        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }

            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) System.out.print(" * ");
            }

            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(" * " + j);
            }

            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }

            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) System.out.print(" * ");
            }

            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(" * " + j);
            }

            System.out.println();
        }
    }
}

  //             1        
  //         1 * 2 * 1      
  //     1 * 2 * 3 * 2 * 1    
  //   1 * 2 * 3 * 4 * 3 * 2 * 1  
  // * 2 * 3 * 4 * 5 * 4 * 3 * 2 * 
  //   1 * 2 * 3 * 4 * 3 * 2 * 1  
  //     1 * 2 * 3 * 2 * 1    
  //         1 * 2 * 1      
  //             1        
