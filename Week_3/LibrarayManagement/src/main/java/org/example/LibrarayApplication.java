package org.example;
import org.example.BookRepository;
import org.example.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class LibrarayApplication {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = (BookService) context.getBean("bookService");


        String bookDetails = bookService.getBookDetails("101");
        System.out.println("Fetched: " + bookDetails);


        bookService.addBook("101 - Clean Code by Robert C. Martin");

    }
}
