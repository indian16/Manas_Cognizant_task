package org.example;

public class BookRepository {
    public String findBookbyID(String bookId) {
        return "Book ID: " + bookId + ", Title: Clean Code";
    }

    public void savebook(String bookDetails) {
        System.out.println("Book saved: " + bookDetails);
    }
}
