package org.example;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }
    public String getBookDetails(String id){
        return bookRepository.findBookbyID(id);
    }
    public void addBook(String bookdetails){
        bookRepository.savebook(bookdetails);
    }
}
