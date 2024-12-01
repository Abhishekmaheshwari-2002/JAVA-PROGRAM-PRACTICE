package com.example.java_test;

public class Fibonacci_series {


    public static int fib_series(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib_series(n - 1) + fib_series(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 15;
        for (int i = 0; i < n; i++) {
            System.out.print(fib_series(i) + ",");
        }
        int fib_sum = fib_series(n);
        System.out.println(fib_sum);
    }

}

