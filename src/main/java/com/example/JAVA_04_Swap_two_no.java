package com.example;
// Java Program to Swap Two values using third variable
public class JAVA_04_Swap_two_no {
    public static void swap_value_without_using_temp(int a, int b) {
//        swap values of two numbers without creating temp variable
        a = a - b;//a=12-3=9
        b = a + b;//b=9+3=12
        a = b - a;//a=12-9=3
        System.out.println("after swap : " + a + "&" + b);
    }

    public static void swap_value_using_temp(int a, int b) {
//        Swapping the values using temp var.
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swap : " + a + "&" + b);
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 3;
        System.out.println("before swap : " + a + "&" + b);
        swap_value_using_temp(a, b);
        swap_value_without_using_temp(a, b);
    }
}
