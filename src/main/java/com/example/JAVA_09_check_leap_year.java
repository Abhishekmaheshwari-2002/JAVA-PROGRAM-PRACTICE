package com.example;

import java.util.Scanner;

//Java Program to Check Leap Year
public class JAVA_09_check_leap_year {
    public static void main(String[] args) {
        System.out.println("Enter the year fot checking the leap year");
        Scanner sc = new Scanner(System.in);
        int leap_year = sc.nextInt();
        //condition for leap year
        if (leap_year % 2 == 0) {
            System.out.println(leap_year + " is leap year");
        } else {
            System.out.println(leap_year + " is not a leap year");
        }
    }
}
