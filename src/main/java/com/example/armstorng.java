package com.example.java_test;

import java.util.*;

public class armstorng {

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int result = 0;
        int numberOfDigits = String.valueOf(number).length();

        while (originalNumber > 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, numberOfDigits);
            originalNumber /= 10;
        }

        return result == number;
    }

    public static void main(String[] args) {
        int num = 153;

        if (isArmstrongNumber(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
