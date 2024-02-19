package com.example;

// java program to add two binary strings
public class JAVA_03_add_binary_no {
    public static String addBinary(String a, String b) {
//converting binary string into integer(decimal number)
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int sum = num1 + num2;
        //Converting that resultant decimal into binary string
        String result = Integer.toBinaryString(sum);
        return result;
    }

    public static void main(String[] args) {
        String m = "101101", n = "001110";
        System.out.println(addBinary(m, n));
    }
}
