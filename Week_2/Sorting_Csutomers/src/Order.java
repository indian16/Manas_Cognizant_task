public class Order {
    private int orderID;
    private String customername;
    private double totalprice;

    public Order(int orderID,String customername,double totalprice){
        this.orderID=orderID;
        this.customername=customername;
        this.totalprice=totalprice;
    }
    public int getOrderID() {return orderID;}
    public String getCustomername() {return customername;}
    public double getTotalprice() {return totalprice;}

    public String toString(){
        return  "Order(" + orderID + ", '" + customername + "', $" + totalprice + ")";
    }

}
