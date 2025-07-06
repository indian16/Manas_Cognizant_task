package org.example;

public class BookRepository {

    public String findBookbyID(String bookId) {
        // Simulated database fetch
        return "Book ID: " + bookId + ", Title: Head First Java";
    }

    public void savebook(String bookDetails) {
        // Simulated database insert
        System.out.println("Book saved: " + bookDetails);
    }
}
