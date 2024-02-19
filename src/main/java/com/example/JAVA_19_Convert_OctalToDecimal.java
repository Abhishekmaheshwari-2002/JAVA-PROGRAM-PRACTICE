package com.example;

// Java program to convert octal
// to decimal number using custom code
public class JAVA_19_Convert_OctalToDecimal {
    public static int OctalToDecimal(int n) {
        int OctToDeci = 0, i = 0;//initialize the value 0
        while (n > 0) {
            int lastdigit = n % 10;//get the last digit
            double powerofoctal = Math.pow(8, i++);//power on 8
            OctToDeci += lastdigit * powerofoctal;//get the result
            n = n / 10;
        }
        return OctToDeci;//return the result
    }

    public static void main(String[] args) {

        System.out.println("Converting the Octal To Decimal : " + OctalToDecimal(157));
        //converting the octal to decimal using predefined method
        String result = "157";
        System.out.println("Converting the Octal To Decimal : " + Integer.parseInt(result, 8));

    }
}
