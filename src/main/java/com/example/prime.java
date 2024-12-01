package com.example.java_test;

public class prime {
    public static void prime(int num) {
        if ((num == 1) && (num == 0)) {
            System.out.println("It is not Prime number");
        } else {
            for (int i = 2; i < num / 2; i++) {
                if (num % 2 == 0) {
                    System.out.println("It is a Prime Number");
                }
            }
        }
    }

    public static void main(String[] args) {
        prime(15);
    }
}
