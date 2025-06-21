import java.util.List;
public class Algorithm {

    public static Product linearSearch(List<Product> products, String targetName) {
        for (Product product : products) {
            if (product.getProductname().equals(targetName)) {
                return product;
            }
        }
        return null;
    }
    public static Product binarySearch(List<Product> products, String targetName){
        int left=0,right=products.size()-1;
        while(left<=right){
            int mid=(left+right)/2;
            Product midProduct=products.get(mid);
            int cmp=midProduct.getProductname().compareTo(targetName);
            if(cmp==0){
                return midProduct;
            }
            else if(cmp<0){
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return null;
    }
}
