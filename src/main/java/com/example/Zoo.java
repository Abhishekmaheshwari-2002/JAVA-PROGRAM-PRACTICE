package com.example.java_exam;

/*
Implement a zoo management system with classes such as Animal (superclass) and
Lion, Elephant, and Monkey (subclasses). Override methods for feeding and displaying
characteristics in each subclass. in simple language with taking user input in JAVA
 */
class Animal {
    public void feed() {
        System.out.println("Generic animal feeding...");
    }

    public void displayCharacteristics() {
        System.out.println("Generic animal characteristics...");
    }
}

class Lion extends Animal {
    @Override
    public void feed() {
        System.out.println("Feeding lion with meat.");
    }

    @Override
    public void displayCharacteristics() {
        System.out.println("Lion: Powerful carnivore with a mane.");
    }
}

class Elephant extends Animal {
    @Override
    public void feed() {
        System.out.println("Feeding elephant with fruits and vegetables.");
    }

    @Override
    public void displayCharacteristics() {
        System.out.println("Elephant: Largest land animal with a trunk and tusks.");
    }
}

class Monkey extends Animal {
    @Override
    public void feed() {
        System.out.println("Feeding monkey with fruits and nuts.");
    }

    @Override
    public void displayCharacteristics() {
        System.out.println("Monkey: Agile and intelligent with a tail.");
    }
}

public class Zoo {

    public static void main(String[] args) {
        Lion li = new Lion();
        li.feed();
        li.displayCharacteristics();

        Elephant ep = new Elephant();
        ep.feed();
        ep.displayCharacteristics();

        Monkey mk = new Monkey();
        mk.feed();
        mk.displayCharacteristics();

    }
}