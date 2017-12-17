package com.pluralsight;


public class Library {

    Book[] collection = new Book[4];
    int index = 0;


    public void printAddress(String address) {
        System.out.println(address);
    }


    public void addBook(Book bookTitle) {
        collection[index] = bookTitle;
        index++;
    }

    public void borrowBook(String bookTitle) {


        Book libraryBook;
        String libraryBookTitle;
        boolean isFound = false;

        for (int i = 0; i < collection.length; i += 1) {

            libraryBook = collection[i];
            if (libraryBook != null) {
                libraryBookTitle = libraryBook.getTitle();

                if (libraryBookTitle.equals(bookTitle)) {
                    if (!(libraryBook.isBorrowed())) {
                        libraryBook.borrowed();
                        System.out.println("You successfully borrowed " + libraryBookTitle);
                    } else {
                        System.out.println("Sorry, this book is already borrowed.");
                    }
                    isFound = true;
                }
            }

        }
        if (isFound == false) {
            System.out.println("Sorry, this book is not in our catalog.");
        }
    }

    public void printAvailableBooks() {
        Book libraryBook;
        boolean isFound = false;

        for (int i = 0; i < collection.length; i += 1) {

            libraryBook = collection[i];
            if (libraryBook != null && !libraryBook.isBorrowed()) {
                System.out.println(libraryBook.getTitle());
                isFound = true;

            }
        }
        if (isFound == false) {
            System.out.println("No book in catalog.");
        }
    }

    public void returnBook(String bookTitle) {
        Book libraryBook;
        String libraryBookTitle;

        for (int i = 0; i < collection.length; i += 1) {
            libraryBook = collection[i];
            if (libraryBook != null) {
                libraryBookTitle = libraryBook.getTitle();
                if (libraryBookTitle.equals(bookTitle)) {
                    libraryBook.returned();
                    System.out.println("You have successfully returned " + libraryBookTitle);
                }
            }
        }
    }
}




