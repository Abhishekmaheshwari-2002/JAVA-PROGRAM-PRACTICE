package com.example.java_exam;
/*Write a Java Program to Find the Largest and Smallest Element in Array without sorting
the array in a simple language with taking user input
 */

import java.util.Scanner;

public class LargestSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size from user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare and initialize an array
        int[] arr = new int[size];

        // Get array elements from user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Initialize variables for largest and smallest elements
        int largest = arr[0];
        int smallest = arr[0];

        // Loop through the array to find largest and smallest
        for (int i = 1; i < size; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        // Display results
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);

    }
}
