import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Product> products=new ArrayList<>();
        products.add(new Product(1,"Laptop","Electronics"));
        products.add(new Product(1, "Laptop", "Electronics"));
        products.add(new Product(2, "Chair", "Furniture"));
        products.add(new Product(3, "Phone", "Electronics"));
        products.add(new Product(4, "Book", "Education"));
        products.add(new Product(5, "Pen", "Stationery"));

        Product foundLiner=Algorithm.linearSearch(products,"Phone");
        System.out.println("Answer by Linaer Serch: "+foundLiner);

        products.sort(Comparator.comparing(Product::getProductname));
        Product foundbinary=Algorithm.binarySearch(products,"Phone");
        System.out.println("Answer by Binary Search "+foundbinary);
    }
}