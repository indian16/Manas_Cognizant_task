import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(101, "Alice", 250.75));
        orders.add(new Order(102, "Bob", 99.99));
        orders.add(new Order(103, "Charlie", 499.50));
        orders.add(new Order(104, "Diana", 180.25));
        orders.add(new Order(105, "Evan", 320.10));

        List<Order> bubbleSortedOrders = new ArrayList<>(orders);
        Algorithm.bubblesort(bubbleSortedOrders);
        System.out.println("Bubble Sorted Orders:");
        for (Order order : bubbleSortedOrders) {
            System.out.println(order);
        }

        List<Order> quickSortedOrders = new ArrayList<>(orders);
        Algorithm.quicksort(quickSortedOrders, 0, quickSortedOrders.size() - 1);
        System.out.println("\nQuick Sorted Orders:");
        for (Order order : quickSortedOrders) {
            System.out.println(order);
        }
    }
}