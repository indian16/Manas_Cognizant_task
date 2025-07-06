package org.example;

public class BookRepository {
    public String findBookbyID(String id){
        return "Book with id" + id;
    }
    public void savebook(String bookdetails){
        System.out.println("Saving Book" + bookdetails);
    }

}
