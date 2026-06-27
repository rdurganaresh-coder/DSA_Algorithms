package com.durga.numericPatterns;

public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--)
                System.out.print("  ");

            if (i == n)
                for (int x = 0; x < n * 2 - 1; x++)
                    System.out.print("* ");
            else
                for (int k = 1; k <= i * 2 - 1; k++)
                    if (k == 1 || k == i * 2 - 1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");

            System.out.println();
        }
    } 
}


//                        *
//                      *   *
//                    *       *
//                  *           *
//                * * * * * * * * *
