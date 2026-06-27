package com.durga.numericPatterns;

public class Pattern4 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 5; j > i; j--)
                System.out.print("  ");
  
            for (int k = 1; k <=i * 2 - 1; k++)
                System.out.print("* ");

            System.out.println();
        }
    }
}

//                     *
//                   * * *
//                 * * * * *
//               * * * * * * *
//             * * * * * * * * *
