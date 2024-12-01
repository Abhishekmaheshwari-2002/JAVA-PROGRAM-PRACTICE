package com.example.java_test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class data implements Serializable {
    String code, name;
    float price;

    data(String c, String n, float p) {
        code = c;
        name = n;
        price = p;

    }
}

