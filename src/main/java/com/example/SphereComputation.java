package com.example.java_exam;

import java.util.Scanner;

/*
Write a program called SphereComputation that prompts user for the radius of a sphere
in floating point number. The program shall read the input as double; compute the
volume and surface area of the sphere in double; and print the values rounded to 2
decimal places. The formulas are:
surfaceArea = 4 * Math.PI * radius * radius;
volume = 4 /3 * Math.PI * radius * radius * radius;
 */
public class SphereComputation {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the radius of a sphere
        System.out.print("Enter the radius of a sphere: ");
        double radius = scanner.nextDouble();

        // Compute the surface area and volume of the sphere
//        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        double surfaceArea = 4 * Math.PI * radius * radius;
        double volume = 4.0 / 3.0 * Math.PI * radius * radius * radius;

        // Print the results rounded to 2 decimal places
        System.out.printf("The surface area of the sphere is: " + String.format("%.2f", surfaceArea));
        System.out.printf("The volume of the sphere is:" + String.format("%.2f", volume));
    }
}

