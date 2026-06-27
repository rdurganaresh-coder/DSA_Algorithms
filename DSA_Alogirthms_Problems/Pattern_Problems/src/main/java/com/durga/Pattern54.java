package com.durga;

public class Pattern54 {
    public static void main(String[] args) {
        int n = 3; // Number of rows
        int cols = 9; // Number of columns

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= cols; j++) {
                // Print numbers in a zig-zag manner
                if ((i + j) % 4 == 0 || (i == 2 && j % 4 == 0)) {
                    System.out.print(j / 3 + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

//     1       2       3
//   1   2   3   4   5
// 1       2       3  
