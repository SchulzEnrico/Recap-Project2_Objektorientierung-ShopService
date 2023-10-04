package de.ES;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderMapRepo implements OrderRepo {
    private Map<String, Order> orderMap;

    public OrderMapRepo() {
        orderMap = new HashMap<>();
    }

    @Override
    public void addOrder(Order order) {
        orderMap.put(order.getOrderId(), order);
    }

    @Override
    public void removeOrder(Order order) {
        orderMap.remove(order.getOrderId());
    }

    @Override
    public List<Order> getAllOrders() {
        return null;
    }

}
