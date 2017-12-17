package com.pluralsight;


public class Main {
/*
https://ocw.mit.edu/courses/electrical-engineering-and-computer-science
/6-092-introduction-to-programming-in-java-january-iap-2010/assignments/

Assignment #4 Library
*/


    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library();
        Library secondLibrary = new Library();


// Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress("10 Main St.");
        secondLibrary.printAddress("228 Liberty St.");
        System.out.println();


// Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));


// Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        System.out.println("First attempt to borrow");
        firstLibrary.borrowBook("The Lord of the Rings");

        System.out.println("Second attempt to borrow");
        firstLibrary.borrowBook("The Lord of the Rings");

       System.out.println("Third attempt to borrow");
       secondLibrary.borrowBook("The Lord of the Rings");
       System.out.println();

/*
// Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

// Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();
// Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }

    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.rented();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
*/
    }

    public static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }
}

