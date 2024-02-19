package com.example;
//Java Program to Check If a Number is Neon Number or Not
import java.util.Scanner;
public class JAVA_11_neon_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for ");
        int num = sc.nextInt();
        int sum = 0, sq, rem; // Initializing current sum to 0 and create two more var.
        sq = num * num;// squaring the number to be checked
        while (sq > 0) {
            rem = sq % 10;//Find remainder
            sum = sum + rem;// Add remainder to the current sum
            sq = sq / 10; // Drop last digit of the product and store the number
        }
        // Condition check Sum of digits of number is equal to original number
        if (sum == num) {
            System.out.println(num + " is a neon number ");
        } else {
            System.out.println(num + " is not a neon number ");

        }
    }
}
/*
neon number : 9 -> 9*9=81
              81-> 8+1=9
 */
