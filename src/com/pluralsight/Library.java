package com.pluralsight;


public class Library {

    Book[] collection = new Book[4];
    int index = 0;
//    java.util.ArrayList<Book> books;


    public void printAddress(String address) {
        System.out.println(address);
    }


    public void addBook(Book bookTitle) {
//      books.add(bookTitle);
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
        /*
        int found = 0;
        for (Book book : books) {
            if (book.getTitle().equals(bookTitle)) {
                if (found == 0) {
                    found = 1;
                }
                if (!book.isBorrowed()) {
                    book.borrowed();
                    found = 2;
                    break;
                }
                ;
            }
        }
        if (found == 0) {
            System.out.println("Sorry, this book is not in our catalog.");
        } else if (found == 1) {
            System.out.println("Sorry, this book is already borrowed.");
        } else if (found == 2) {
            System.out.println("You successfully borrowed " + bookTitle);
        }
    }


}
*/

}



