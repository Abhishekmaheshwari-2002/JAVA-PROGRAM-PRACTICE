package com.example;
//Java Program to Print Left Triangle Star Pattern
public class JAVA_15_Left_angle_star_pattern {
    public static void Left_Triangle_Star_Pattern(int n) {
        System.out.println("********Left angle star pattern********* ");
        // outer loop to handle number of rows
        for (int i =1; i <= n; i++) {
            // printing spaces for left angle pattern
            for (int k = (n - i); k >= 0; k--) {
                System.out.print(" ");
            }
            // inner loop to handle number of columns
            // values changing acc. to outer loop
            for (int j =1; j <= i; j++) {
                //printing the stars
                System.out.print("*");
            }
            //end-line
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 9;
        Left_Triangle_Star_Pattern(n);
    }
}
//    public static void main(String[] args) {
//        int num = 5;
// outer loop to handle number of rows
//        for (int i = 1; i <= num; i++) {
// inner loop to handle number of columns
// values changing acc. to outer loop
//            for (int j = i; j <= num; j++) {
//                System.out.print("  ");//two space for left angle star pyramid pattern
//            }
//            for (int k = 1; k <= (2 * i - 1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }