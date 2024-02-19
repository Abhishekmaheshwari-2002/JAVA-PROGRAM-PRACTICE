package com.example;
//Java Program to Print Pyramid Star Pattern

public class JAVA_17_pyramid_star_pattern {
    public static void main(String[] args) {
        int num = 7;
//         outer loop to handle number of rows
        for (int i = 1; i <= num; i++) {
//             printing spaces for pyramid pattern
            for (int j = i; j <= num; j++) {
                System.out.print("");
            }
//             inner loop to handle number of columns
//             values changing acc. to outer loop
            for (int k = 1; k <= (2 * i - 1); k++) {
//                printing the stars
                System.out.print("*");
//                System.out.print(k);
            }
//            end-line
            System.out.println();
        }
    }
}

