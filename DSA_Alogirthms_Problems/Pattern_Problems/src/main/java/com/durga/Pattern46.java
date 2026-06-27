package com.durga;

class Pattern46 {
    public static void main(String[] args) {
        int n = 7; // Size of the hourglass

        // Upper half of the hourglass
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  "); // Print leading spaces
            }
            for (int j = 1; j <= n - 2 * i; j++) {
                if (j == 1 || j == n - 2 * i) {
                    System.out.print((j + i) + " "); // Print first and last numbers
                } else {
                    System.out.print("  "); // Print spaces inside
                }
            }
            System.out.println();
        }

        // Lower half of the hourglass
        for (int i = n / 2 - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  "); // Print leading spaces
            }
            for (int j = 1; j <= n - 2 * i; j++) {
                if (j == 1 || j == n - 2 * i) {
                    System.out.print((j + i) + " "); // Print first and last numbers
                } else {
                    System.out.print("  "); // Print spaces inside
                }
            }
            System.out.println();
        }
    }
}

// 1 2 3 4 5 6 7  
// 1 2       6 7  
// 1           7  
// 1           7  
// 1 2       6 7  
// 1 2 3 4 5 6 7
