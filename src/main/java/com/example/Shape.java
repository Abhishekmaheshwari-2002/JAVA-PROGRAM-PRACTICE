package com.example.java_exam;

import java.util.Scanner;

// Define the Shape superclass with abstract methods for area and perimeter
abstract class Shapes {
    // Abstract method for calculating area
    public abstract double getArea();

    // Abstract method for calculating perimeter
    public abstract double getPerimeter();
}

// Define the Rectangle subclass of Shape
class Rectangle extends Shapes {
    double width;
    double height;

    // Constructor for Rectangle
    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    // Implement the getArea method for Rectangle
    public double getArea() {
        return width * height;
    }

    // Implement the getPerimeter method for Rectangle
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

// Define the Circle subclass of Shape
class Circle extends Shapes {
    double radius;

    // Constructor for Circle
    public Circle(double r) {
        radius = r;
    }

    // Implement the getArea method for Circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Implement the getPerimeter method for Circle
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Main class to take user input and call the methods
public class Shape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();

        Rectangle rect = new Rectangle(width, height);
        System.out.println("Area of rectangle: " + rect.getArea());
        System.out.println("Perimeter of rectangle: " + rect.getPerimeter());

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Circle circ = new Circle(radius);
        System.out.println("Area of circle: " + circ.getArea());
        System.out.println("Perimeter of circle: " + circ.getPerimeter());

        scanner.close();
    }
}
