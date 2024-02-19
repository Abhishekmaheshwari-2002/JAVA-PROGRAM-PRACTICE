package com.example;
//Java Program to Print Right Triangle Star Pattern
public class JAVA_14_Right_angle_star_pattern {
    public static void star_pattern(int n) {
        System.out.println("********Right angle star pattern********* ");
        // outer loop to handle number of rows
        for (int i = 1; i <= n; i++){
            // inner loop to handle number of columns
            // values changing acc. to outer loop
            for (int j = 1; j <= i; j++) {
              //printing the stars
                System.out.print("*");
            }
            //end-line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int k =5;
        star_pattern(k);
    }
}
//    public static void main(String[] args) {
//        int num = 5;
// outer loop to handle number of rows
//        for (int i = 1; i <= num; i++) {
// inner loop to handle number of columns
// values changing acc. to outer loop
//            for (int j = i; j <= num; j++) {
//                System.out.print("");//no space for right angle star pyramid pattern
//            }
//            for (int k = 1; k <= (2 * i - 1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }