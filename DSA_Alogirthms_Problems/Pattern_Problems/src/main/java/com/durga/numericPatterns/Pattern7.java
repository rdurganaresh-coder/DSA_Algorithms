package com.durga.numericPatterns;

public class Pattern7 {
    public static void main(String[] args) {
        int n = 9;

        for (int i = 1; i <= n / 2 + 1; i++) {
            for (int j = 1; j < i; j++)
                System.out.print("  ");

            for (int k = n; k >= i * 2 - 1; k--)
                System.out.print("* ");

            System.out.println();
        }
 
        for (int i = 1; i <= n / 2; i++) {
            for (int j = n / 2; j > i; j--)
                System.out.print("  "); 

            for (int k = 1; k <= i * 2 + 1; k++)
                System.out.print("* ");

            System.out.println();
        }
    }
}


//        * * * * * * * * *
//          * * * * * * *
//            * * * * *
//              * * *
//                *
//              * * *
//            * * * * *
//          * * * * * * *
//        * * * * * * * * *
