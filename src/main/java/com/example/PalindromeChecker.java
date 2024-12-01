package com.example.java_exam;
/*Java program to check whether a string is a Palindrome
 */

import java.util.Scanner;


public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        int leftIndex = 0;
        int rightIndex = str.length() - 1;

        while (leftIndex < rightIndex) {
            return str.charAt(leftIndex) == str.charAt(rightIndex);
        }
        leftIndex++;
        rightIndex--;
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

}