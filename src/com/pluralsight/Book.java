package com.pluralsight;

public class Book {
    String title;
    boolean borrowed = false;


    // Creates a new Book
    public Book(String bookTitle) {
        this.title = bookTitle;
        System.out.println(bookTitle + " has been added");
    }

    // Marks the book as rented
    public void borrowed() {

        // Implement this method later
        borrowed = true;
    }

    // Marks the book as not rented
    public void returned() {
        // Implement this method
        borrowed = false;
    }

    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        // Implement this method
        return borrowed;
    }


// Returns the title of the book
    public String getTitle() {
        // Implement this method
        return title;
    }



}
