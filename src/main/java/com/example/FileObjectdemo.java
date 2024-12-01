package com.example.java_test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileObjectdemo {
    public static void main(String[] args) {
        data d1 = new data("poo1", "Mouse", 500);
        data d2 = new data("poo2", "KEY", 600);

        try (FileOutputStream fout = new FileOutputStream("data.txt"); ObjectOutputStream obj = new ObjectOutputStream(fout)) {

            obj.writeObject(d1);
            obj.writeObject(d2);
        } catch (IOException ex) {
            System.out.println("error" + ex);
        }


    }

}
