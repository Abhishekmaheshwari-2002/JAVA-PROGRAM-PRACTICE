package com.example.java_exam;

class EvenPrinter implements Runnable {

    public synchronized void printEven() {
        int number = 0;
        int limit = 500;
        boolean isOdd = true;
        while (true) {
            if (!isOdd) {
                System.out.print(number + " ");
                number++;
                isOdd = true;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void run() {
        printEven();
    }
}


class OddPrinter implements Runnable {
    int number = 0;
    int limit = 500;
    boolean isOdd = true;

    public synchronized void printOdd() {
        while (true) {
            if (isOdd) {
                System.out.print(number + " ");
                number++;
                isOdd = false;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void run() {
        printOdd();
    }
}


public class PrintOddEven {

    public static void main(String[] args) {


        Thread oddThread = new Thread(new OddPrinter());
        Thread evenThread = new Thread(new EvenPrinter());

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}