package com.example.java_exam;
/*Develop a school management system with classes like Person (superclass) and
Student and Teacher (subclasses). Override methods for displaying information in each
subclass

 */

import java.util.Scanner;

class Persons {
    String name;
    int age;

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Student extends Persons {
    private String major;
    private String grade;

    public Student(String name, int age, String major, String grade) {
        super(name, age);
        this.major = major;
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Age: " + getAge() + ", Major: " + major + ", Grade: " + grade;
    }
}

class Teacher extends Persons {
    String subject;
    boolean fullTime;

    public Teacher(String name, int age, String subject, boolean fullTime) {
        super(name, age);
        this.subject = subject;
        this.fullTime = fullTime;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Age: " + getAge() + ", Subject: " + subject + ", Full-time: " + isFullTime();
    }
}

public class Person {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student information:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Major: ");
        String major = scanner.nextLine();
        System.out.print("Grade: ");
        String grade = scanner.nextLine();

        Student student = new Student(name, age, major, grade);
        System.out.println(student);

        System.out.println("Enter Teacher information:");
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Subject: ");
        String subject = scanner.nextLine();
        System.out.print("Full-time (true or false): ");
        boolean fullTime = scanner.nextBoolean();

        Teacher teacher = new Teacher(name, age, subject, fullTime);
        System.out.println(teacher);

        scanner.close();
    }
}
