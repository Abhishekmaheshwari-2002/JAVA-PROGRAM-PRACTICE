package com.example;
//Java Program to Print Reverse Pyramid Star Pattern
public class JAVA_16_Riverse_pyramid_star_pattern {
    public static void main(String[] args) {
        int num = 5;
        // outer loop to handle number of rows
        for (int i = num; i >= 1; i--) {
            // printing spaces for Riverse pyramid pattern
            for (int j = i; j <= num; j++) {
                System.out.print(" ");
            }
            // inner loop to handle number of columns
            // values changing acc. to outer loop
            for (int k = 1; k <= (2 * i - 1); k++) {
                //printing the stars
                System.out.print("*");
            }
            //end-line
            System.out.println();
        }
    }
}
