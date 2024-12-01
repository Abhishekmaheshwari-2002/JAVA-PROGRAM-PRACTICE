package com.example.java_exam;

/*Create a game using a class hierarchy for characters. Have a superclass Character and
subclasses like Warrior, Mage, and Rogue. Override methods for attacking and
defending in each subclass in simple language with taking user input in JAVA
 */
class Characters {
    public void attack() {
        System.out.println("attack");
    }

    public void defend() {
        System.out.println("Defending...");
    }
}

class Warrior extends Characters {
    @Override
    public void attack() {
        System.out.println("Warrior attack!");
    }

    @Override
    public void defend() {
        System.out.println("Warrior defend");
    }
}

class Mage extends Characters {
    @Override
    public void attack() {
        System.out.println("mage attack ");
    }

    @Override
    public void defend() {
        System.out.println("mage defend");
    }
}

class Rogue extends Characters {
    @Override
    public void attack() {
        System.out.println("rouge attack ");
    }

    @Override
    public void defend() {
        System.out.println("rouge defend!");
    }
}

public class Character {

    public static void main(String[] args) {

        Warrior war = new Warrior();
        war.attack();
        war.defend();

        Mage mg = new Mage();
        mg.attack();
        mg.defend();

        Rogue rg = new Rogue();
        rg.attack();
        rg.defend();

    }

}

