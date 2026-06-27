package com.durga;

public class Pattern28 {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the pyramid

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print alternating 0 and 1
            int num = (i % 2 == 0) ? 0 : 1; // Start with 0 for even rows, 1 for odd rows
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(num + " ");
                // Alternate between 0 and 1
                num = 1 - num;
            }

            System.out.println();
        }
    }
}

//         1
//       0 1 0
//     1 0 1 0 1
//   0 1 0 1 0 1 0
// 1 0 1 0 1 0 1 0 1
