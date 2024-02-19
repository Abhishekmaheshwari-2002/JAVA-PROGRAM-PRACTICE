package com.example;

// Java program to convert a Decimal Number to Octal Number
public class JAVA_20_decimalToocatal {

    //Method to convert decimal to octal
    public static void deciToOct(int n) {
        int[] result = new int[100];//integer array to stored to the octal number
        int i = 0;
        for (i = 0; n != 0; i++) {
            result[i] = n % 8;//storing0 remainder in octal array
            n = n / 8;
        }
        for (int j = i - 1; j >= 0; j--) {
            //printing the octal array in reverse order
            System.out.print(result[j]);
        }
    }

    public static void main(String[] args) {
        int n = 111;
        deciToOct(n);
    }
}
