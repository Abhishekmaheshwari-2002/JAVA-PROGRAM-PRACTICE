package com.example;
//Java Program to Check Armstrong Number between Two Integers

import java.util.Scanner;

public class JAVA_10_Armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for armstrong between two integer ");
//         Numbers between two integers
        int num1 = sc.nextInt();//input from the users
        int num2 = sc.nextInt();
        for (int i = num1; i < num2; i++) {
            int rem, check, sum = 0;//create three variable
            check = i;
            while (check != 0) {
                rem = check % 10;//spilt the number into digit
                sum = sum + (rem * rem * rem);//check the armstrong number or not
                check = check / 10;//it is imp condition for armstrong number
            }
            //sum == i is equal so the ith number is armstrong
            if (sum == i) {
                System.out.print(sum + ", ");//here is print the number
            }
        }
    }
}
