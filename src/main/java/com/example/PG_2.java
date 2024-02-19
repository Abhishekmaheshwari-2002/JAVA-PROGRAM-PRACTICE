package com.example;

import java.util.Scanner;

public class PG_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int rem;
        while (num > 0) {
            rem = num % 10;//spilt the number into digit
            sum = sum + rem;//check the armstrong number or not
            num = num / 10;
            if (num <= 0 && sum > 9) {
                num = sum;
                sum = 0;
            }
        }
        System.out.println(sum);
    }
}
