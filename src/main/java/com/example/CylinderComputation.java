package com.example.java_exam;
/*Write a program called CylinderComputation that prompts user for the base radius and
height of a cylinder in floating point number. The program shall read the inputs as
double; compute the base area, surface area, and volume of the cylinder; and print the
values rounded to 2 decimal places. The formulas are:
baseArea = Math.PI * radius * radius;
surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
volume = baseArea * height in JAVA in Simple language
 */

import java.util.Scanner;

public class CylinderComputation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the base radius of the cylinder: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        // Calculate base area
        double baseArea = Math.PI * radius * radius;

        // Calculate surface area
        double surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;

        // Calculate volume
        double volume = baseArea * height;

        // Print results rounded to 2 decimal places
        System.out.println("Base Area: " + String.format("%.2f", baseArea));
        System.out.println("Surface Area: " + String.format("%.2f", surfaceArea));
        System.out.println("Volume: " + String.format("%.2f", volume));
    }
}
