package com.example;

//Java Program to Find Largest Among 3 Numbers
public class JAVA_07_find_largest_num {
    // Function to find the biggest of three numbers
//    public static int find_largest_num(int x, int y, int z) {
//        return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
//    }

    public static void main(String[] args) {
        int x = 25, y = 3, z = 45;
        if (x > y && x > z) {
            System.out.println(" x is largest num : " + x);
        } else if (y > x && y > z) {
            System.out.println(" y is largest num : " + y);
        } else {
            System.out.println(" z is largest num : " + z);
        }

//        System.out.println(find_largest_num(x, y, z) + " is the largest number ");

    }
}
