package MyBase;

import java.util.ArrayList;

// Invoker.
class Agent {
    private ArrayList<Order> ordersQueue = new ArrayList();

    public Agent() {
    }

    void placeOrder(Order o) {
        System.out.println("placing " + o.getAction() + " order for " + o.getSymbolQuantity() + " shares of " + o.getSymbolName());
        ordersQueue.add(o);
    }

    void cancelOrder(Order o) {
        if (ordersQueue.contains(o)) {
            System.out.println("canceling " + o.getAction() + " order for " + o.getSymbolQuantity() + " shares of " + o.getSymbolName());
        }
        else {
            System.out.println("FAILED to cancel " + o.getAction() + " order for " + o.getSymbolQuantity() + " shares of " + o.getSymbolName());
        }
        ordersQueue.remove(o);
    }

    void executeOrders() {
        for (Order o : ordersQueue) {
            o.execute();
        }

        ordersQueue = new ArrayList();
    }

    public void displayOrders() {
        System.out.println(" ");
        System.out.println("current list of orders:");
        for (Order o : ordersQueue) {
            System.out.println(o.getAction() + " " + o.getSymbolName() + " " + o.getSymbolQuantity());
        }
        System.out.println(" ");
    }
}
