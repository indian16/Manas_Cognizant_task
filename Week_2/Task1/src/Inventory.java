import java.util.HashMap;
public class Inventory {
    private HashMap<String,Product> products;
    public Inventory(){
        products=new HashMap<>();
    }
    public void addProduct(Product product){
        products.put(product.getProductid(),product);
        System.out.println("Product added: "+product);
    }
    public void updateProduct(String productid,int quantity,
                              double price){
        Product product=products.get(productid);
        if(product!=null){
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product updated: "+product);
        }
        else{
            System.out.println("Product not found.");
        }
    }
    public void deleteProduct(String productid){
        if(products.containsKey(productid)){
            products.remove(productid);
            System.out.println("Product deleted with ID: "+productid);

        }
        else {
            System.out.println("Product not found.");
        }
    }
    public void displayProducts(){
        if(products.isEmpty()){
            System.out.println("Inventory is empty");
        }
        else{
            for(Product p:products.values()){
                System.out.println(p);
            }
        }
    }
}
