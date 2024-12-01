package com.example.java_test;

public class palindrome {
    public static void main(String[] args) {
        int num = 151;
        int reverse = 0;
        int orignal = num;
        while (num > 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }
        if (orignal == reverse) {
            System.out.println("it is a palindrome number");
        } else {
            System.out.println("it is not  a palindrome number");

        }
    }
}
