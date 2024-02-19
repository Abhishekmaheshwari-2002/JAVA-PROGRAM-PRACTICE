package com.example;

import java.util.Scanner;

//Java Program to Calculate Simple Interest
public class JAVA_13_SI {
    public static void main(String[] args) {
        int p = 10000;//principal amount
        int r = 8;//principal rate
        int t = 4;//Time
        System.out.println("Principal amount :" + p);
        System.out.println("Principal rate :" + r);
        System.out.println("Time :" + t);
        int Simple_interest = (p * r * t) / 100;//Simple interest
        int total_SI = Simple_interest + p;//total simple interest
        System.out.println("Total Simple Interest :" + total_SI);
    }
}
