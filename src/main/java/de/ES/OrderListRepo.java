package de.ES;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo {
    private List<Order> orderList;

    public OrderListRepo() {
        orderList = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public void removeOrder(Order order) {
        orderList.remove(order);
    }

    public List<Order> getAllOrders() {
        return orderList;
    }
}
