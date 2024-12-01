package com.example.java_exam;
/*Java String Program to Remove leading zeros. (Input : 0001234ABC, Output : 1234ABC). in simple language with taking user input
 */

import java.util.Scanner;

public class RemoveLeadingZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string with leading zeros:");
        String input = scanner.nextLine();
        String result = input.replaceAll("0", "");
        System.out.println("Output: " + result);
    }
}