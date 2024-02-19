package com.example;
//Java Program to Create a Class and Object
class base_class {
    int a;
    String str;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}

public class JAVA_22_class_obj {
    public static void main(String[] args) {
        base_class cb = new base_class();
        cb.setA(15);
        cb.setStr("Abhishek maheshwari ");
        System.out.println(cb.getA());
        System.out.println(cb.getStr());
    }
}
