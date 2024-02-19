package com.example;

public class PG_1 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        for (int i = 101; i < 200; i++) {
            if (i % 7 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println(sum);
        System.out.println(count);

    }
}
