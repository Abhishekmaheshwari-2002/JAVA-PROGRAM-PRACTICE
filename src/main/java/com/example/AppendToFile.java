package com.example.java_exam;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name:");
        String fileName = scanner.nextLine();
        System.out.println("Enter the data to append:");
        String data = scanner.nextLine();

        try {
            File file = new File(fileName);
            FileWriter fileWriter = new FileWriter(fileName, true); // 'true' for append mode
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.newLine();
            bufferedWriter.close();

            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            System.out.println("Error appending data to file: " + e.getMessage());
        }
    }
}