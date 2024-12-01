package com.example.java_exam;

/*

Design a class hierarchy for vehicles. Have a superclass Vehicle and subclasses Car,
Motorcycle, and Truck. Implement methods for starting, stopping, and accelerating in
each subclass in simple language with taking user input in JAVA
 */
abstract class Vehicles {

    public abstract void start();

    public abstract void stop();

    public abstract void accelerate();
}

class Car extends Vehicles {
    @Override

    public void start() {
        System.out.println("Car starting...");

    }

    @Override

    public void stop() {
        System.out.println("Car stoping...");

    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerating...");
    }
}

class Motorcycle extends Vehicles {
    @Override

    public void start() {
        System.out.println("Motorcycle starting...");

    }

    @Override

    public void stop() {
        System.out.println("Motorcycle stopping...");

    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle accelerating...");
    }
}

class Truck extends Vehicles {
    @Override

    public void start() {
        System.out.println("Truck starting...");

    }

    @Override

    public void stop() {
        System.out.println("Truck stopping...");

    }

    @Override
    public void accelerate() {
        System.out.println("Truck accelerating...");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Truck truck = new Truck();

        car.start();
        car.accelerate();
        car.stop();

        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.stop();

        truck.start();
        truck.accelerate();
        truck.stop();
    }
}

