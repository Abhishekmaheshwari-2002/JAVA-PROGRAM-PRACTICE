package com.example;

public class JAVA_12_factorial_number {
    // method to find factorial of given number
    public static int fac(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fac(n - 1);//this process is called recursion
        }
    }
    public static void main(String[] args) {
        int n = 4;//integer variable created
        System.out.println("The factorial number is : " + fac(n));
    }
}
