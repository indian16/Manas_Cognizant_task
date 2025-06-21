import java.util.*;
public class Main {
    public static void main(String[] args) {

            List<Book> books = new ArrayList<>();
            books.add(new Book(101, "Clean Code", "Robert C. Martin"));
            books.add(new Book(102, "Effective Java", "Joshua Bloch"));
            books.add(new Book(103, "The Pragmatic Programmer", "Andy Hunt"));
            books.add(new Book(104, "Design Patterns", "Erich Gamma"));
            books.add(new Book(105, "Refactoring", "Martin Fowler"));

            System.out.println("Linear Search ");
            System.out.println(Library.linearsearch(books, "Effective Java"));

            books.sort(Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));

            System.out.println("\nBinary Search");
            System.out.println(Library.binarysearch(books, "Effective Java"));
    }
}