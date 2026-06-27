package com.durga;

public class Pattern21 {
    public static void main(String[] args) {

    int n = 15; // Number of columns (length of the pattern)

        for (int i = 1; i <= 3; i++) { // Three rows for the zig-zag
            for (int j = 1; j <= n; j++) {
                // Print '*' when (i + j) % 4 == 0 for the first and second rows
                // Print '*' when j % 4 == 0 for the third row
                if ((i + j) % 4 == 0 || (i == 2 && j % 4 == 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print space otherwise
                }
            }
            System.out.println();
        }
    }
}

//    *       *       *   
//  *   *   *   *   *   * 
//*       *       *       *
