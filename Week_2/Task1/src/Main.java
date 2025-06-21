//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Inventory inventory=new Inventory();
            Product p1=new Product("P001","Laptop",10,999.99);
        Product p2=new Product("P002","Mouse",50,25.99);
        inventory.addProduct(p1);
        inventory.addProduct(p2);

        inventory.updateProduct("P001",8,950.00);
        inventory.deleteProduct("P002");

        inventory.displayProducts();


    }
}