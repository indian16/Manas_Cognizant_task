package org.example;

public class Orderservice {
    private Notifier notifier;
    public Orderservice(Notifier notifier){
        this.notifier=notifier;
    }
    public void placeorder(){
        notifier.sendNotification("Order placed successfully");
    }
}
