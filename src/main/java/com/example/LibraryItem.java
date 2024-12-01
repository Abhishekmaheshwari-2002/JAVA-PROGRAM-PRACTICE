package com.example.java_exam;

/*Design a library system with classes LibraryItem (superclass) and Book, DVD, and
Magazine (subclasses). Override methods for borrowing and returning items in each
subclass
 */
// LibraryItem superclass
class LibraryItems {

    public void borrow() {
        System.out.println("Item borrowed");
    }

    public void returnItem() {
        System.out.println("Item returned");
    }
}

// Book subclass
class Book extends LibraryItem {
    String title;

    public Book(String title) {
        this.title = title;
    }

    public void borrow() {
        System.out.println("Book borrowed " + title);
    }

    public void returnItem() {
        System.out.println("Book returned " + title);
    }
}

// DVD subclass
class DVD extends LibraryItem {
    String director;

    public DVD(String director) {
        this.director = director;
    }

    public void borrow() {
        System.out.println("DVD borrowed " + director);
    }

    public void returnItem() {
        System.out.println("DVD returned " + director);
    }
}

// Magazine subclass
class Magazine extends LibraryItem {
    String name;

    public Magazine(String name) {
        this.name = name;
    }

    public void borrow() {
        System.out.println("DVD borrowed " + name);
    }

    public void returnItem() {
        System.out.println("DVD returned " + name);
    }

}

public class LibraryItem {
    public static void main(String[] args) {
        Book book = new Book("Java Programming");
        DVD dvd = new DVD("Inception");
        Magazine magazine = new Magazine("National Geographic");

        book.borrow();
        dvd.borrow();
        magazine.borrow();

        book.returnItem();
        dvd.returnItem();
        magazine.returnItem();
    }
}

