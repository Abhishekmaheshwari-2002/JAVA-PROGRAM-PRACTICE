package com.example.java_test;

public class pay {
    public static void main(String[] args) {
        int sallary = 20;
        int pay = 0;
        for (int i = 1; i <= 31; i++) {
            pay = pay + sallary;
            sallary = sallary * 2;
        }
        System.out.println(sallary);
    }
}
