package com.example.java_exam;

import java.util.Scanner;

class TicketBookingSystem {
    public int id;
    public boolean booked;

    public TicketBookingSystem(int id) {
        this.id = id;
    }

    public synchronized boolean book() {
        if (!booked) {
            booked = true;
            return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }
}

class BookingThread implements Runnable {
    int id;
    Ticket[] tickets;
    Scanner scanner;

    public BookingThread(int id, Ticket[] tickets, Scanner scanner) {
        this.id = id;
        this.tickets = tickets;
        this.scanner = scanner;
    }

    @Override
    public void run() {
        System.out.print("Thread " + id + ": ");
        int ticketId = scanner.nextInt();
        if (ticketId < 1 || ticketId > tickets.length) {
            System.out.println("Invalid ticket ID!");
            return;
        }

        Ticket ticket = tickets[ticketId - 1];
        if (ticket.book()) {
            System.out.println("Ticket " + ticket.getId() + " booked successfully!");
        } else {
            System.out.println("Ticket " + ticket.getId() + " already booked!");
        }
    }
}


public class Ticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ticket[] tickets = new Ticket[5];
        for (int i = 0; i < tickets.length; i++) {
            tickets[i] = new Ticket(i + 1);
        }

        Thread thread1 = new Thread(new BookingThread(1, tickets, scanner));
        Thread thread2 = new Thread(new BookingThread(2, tickets, scanner));

        thread1.start();
        thread2.start();
    }
}
