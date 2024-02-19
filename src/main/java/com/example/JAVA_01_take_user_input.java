package com.example;

import java.util.Scanner;

public class JAVA_01_take_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the string :");
        str = sc.nextLine();
        System.out.println("Enter the no : ");
        int a = sc.nextInt();
        System.out.println("a = " + a);
        System.out.println("String : " + str);

    }
}
