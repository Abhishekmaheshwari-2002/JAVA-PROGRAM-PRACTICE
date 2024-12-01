package com.example.java_exam;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {

    public static void main(String[] args) throws IOException {
        // Get user input for source and destination file names
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the file to copy from: ");
        String sourceFile = scanner.nextLine();

        System.out.print("Enter the name of the file to copy to: ");
        String destinationFile = scanner.nextLine();

        // Create reader and writer objects
        FileReader reader = new FileReader(sourceFile);
        FileWriter writer = new FileWriter(destinationFile);

        // Read and write characters one at a time
        int character;
        while ((character = reader.read()) != -1) {
            writer.write(character);
        }

        // Close the reader and writer objects
        reader.close();
        writer.close();

        System.out.println("File copied successfully!");
    }
}

