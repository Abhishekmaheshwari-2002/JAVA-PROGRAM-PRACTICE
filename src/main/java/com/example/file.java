package com.example.java_test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class file {
    public static void main(String[] args) {
        String str1 = "my name is abhishek maheshwari";
        String str2 = "my name is abhishek ";
        try (FileOutputStream fout1 = new FileOutputStream("demo1.txt"); FileOutputStream fout2 = new FileOutputStream("demo2.txt")) {
            fout1.write(str1.getBytes());
            fout2.write(str2.getBytes());
        } catch (IOException ex) {
            System.out.println("Error" + ex);
        }
        int i, j;
        try (FileInputStream fin1 = new FileInputStream("demo1.txt"); FileInputStream fin2 = new FileInputStream("demo2.txt")) {
            do {
                i = fin1.read();
                j = fin2.read();
                if (i == j) {
                    break;
                }
            } while (i != -1 && j != -1);
            if (i == j) {
                System.out.println("both file are same");
            } else {
                System.out.println("both are not same");
            }

        } catch (Exception e) {
            System.out.println("Error");
        }

    }

}
