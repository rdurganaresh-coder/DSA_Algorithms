package com.durga.numericPatterns;

public class Pattern45 {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        int num = 1; // Starting number

        for (int i = 1; i <= n; i++) {
            // Print leading spaces for zig-zag effect
            for (int j = 1; j <= (i % 2 == 0 ? 2 : 1); j++) {
                System.out.print("  ");
            }

            // Print numbers in the row
            for (int j = 1; j <= 3; j++) {
                if (num <= n * 3) { // Prevents extra numbers
                    System.out.print(num + "   ");
                    num++;
                }
            }

            System.out.println();
        }
    }
}

// 1   2   3  
//   4   5  
// 6   7   8  
//   9  10  
// 11  12  13