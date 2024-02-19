package com.example;

//Java Program to Display All Prime Numbers from 1 to N
public class JAVA_08_find_prime_number {
    public static void main(String[] args) {
        int n = 63, i, j, prime;// create integer for printing the prime number
        System.out.println("All the prime no. 1 To are 63 :");
        //create two for loop for printing prime number
        for (i = 2; i <= n; i++) {
            //0 and 1 is not a prime number
            if (i == 0 || i == 1) {
                continue;
            }
            prime = 0;//initialize the value zero
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    prime++;
                }
            }
            //here is the condition for printing prime number
            if (prime == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
