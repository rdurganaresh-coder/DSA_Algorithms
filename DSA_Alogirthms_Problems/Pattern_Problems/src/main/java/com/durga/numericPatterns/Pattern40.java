package com.durga.numericPatterns;

public class Pattern40 {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = n; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}

// 1 2 3 4 5
//  1 2 3 4
//   1 2 3
//    1 2
//     1
