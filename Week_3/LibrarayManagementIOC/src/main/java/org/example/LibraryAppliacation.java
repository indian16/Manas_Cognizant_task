package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class LibraryAppliacation {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService=(BookService) context.getBean("bookService");

        String bookdetails=bookService.getBookDetails("101");
        System.out.println("Book found "+ bookdetails);

        bookService.addBook("book id "+ bookdetails + "added");
    }

}
