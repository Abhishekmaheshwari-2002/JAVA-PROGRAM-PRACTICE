package com.example;

import java.util.Scanner;

public class PG_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }
        int s = num[0];
        for (int i = 0; i < 10; i++) {
            if (num[0] < s) {
                s = num[i];
            }
        }
        System.out.println(s);
    }
}
