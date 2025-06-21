public class Product {
    private int productid;
    private String productname;
    private String category;

    public Product(int productid,String productname,String category){
        this.productid=productid;
        this.productname=productname;
        this.category=category;
    }
    public int getProductid() {return productid;}
    public String getProductname() {return productname;}
    public String getCategory() {return category;}

    public String toString(){
        return "Product(" + productid + "," +productname + "," + category +" )";
    }
}
