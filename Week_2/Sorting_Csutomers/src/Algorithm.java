import java.util.List;
public class Algorithm {
    public static void bubblesort(List<Order> orders){
        int n=orders.size();
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(orders.get(j).getTotalprice()>orders.get(j+1).getTotalprice()){
                    Order temp =orders.get(j);
                    orders.set(j,orders.get(j+1));
                    orders.set(j+1,temp);
                }
            }
        }
    }
    public static void quicksort(List<Order> orders,int low,int high){
        if(low<high){
            int index=partition(orders,low,high);
            quicksort(orders,low,index-1);
            quicksort(orders,index+1,high);
        }
    }
    private static int partition(List<Order> orders, int low, int high) {
        double pivot = orders.get(high).getTotalprice();
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (orders.get(j).getTotalprice() <= pivot) {
                i++;
                Order temp = orders.get(i);
                orders.set(i, orders.get(j));
                orders.set(j, temp);
            }
        }
        Order temp = orders.get(i + 1);
        orders.set(i + 1, orders.get(high));
        orders.set(high, temp);
        return i + 1;
    }
}
