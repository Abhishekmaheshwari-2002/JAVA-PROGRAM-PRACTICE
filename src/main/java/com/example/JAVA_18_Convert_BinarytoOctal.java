package com.example;
//Java program to convert binary to octal
public class JAVA_18_Convert_BinarytoOctal {
     //method to convert Binary to decimal
    public static int binaryTodecimal(long binary_num) {
     //variable to store decimal number
        int binarytodeci = 0, i = 0;
     //System.out.println("Convert the binary to decimal ");
     //loop for extract decimal from binary
        while (binary_num > 0) {
            // multiplying each digit of binary with increasing powers of 2 toward left
            binarytodeci += Math.pow(2, i++) * (binary_num % 10);
            // dividing the binary by 10 to remove the last digit
            binary_num = binary_num / 10;
        }
        //return converted binary number into decimal
        return binarytodeci;
    }
        //method to convert decimal to octal
    public static int decimalToOctal(long binary_num) {
        // variable to store the decimal number
        // returned by the binaryToDecimal()
        int decimal = binaryTodecimal(binary_num);
        // converting the String of octal number to an Integer
        String string_octal = Integer.toOctalString(decimal);
        return Integer.parseInt(string_octal);//again convert string of octal into decimal and return decimal
        // octal
    }

    public static void main(String[] args) {
        // calling and printing the decimalToOctal method
        System.out.println("octal : " + decimalToOctal(10011100));

    }
}
