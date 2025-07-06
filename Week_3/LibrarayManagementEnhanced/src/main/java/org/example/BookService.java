package org.example;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String getBookDetails(String bookId) {
        return bookRepository.findBookbyID(bookId);
    }

    public void addBook(String bookDetails) {
        bookRepository.savebook(bookDetails);
    }
}
