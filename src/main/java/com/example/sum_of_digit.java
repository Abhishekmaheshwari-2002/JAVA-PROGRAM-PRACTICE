package com.example.java_test;

public class sum_of_digit {

    public static int sumOfDigits(int num) {
        return 1 + (num - 1) % 9;
    }

    public static void main(String[] args) {
        int number = 12345;
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + sum);
    }
}

