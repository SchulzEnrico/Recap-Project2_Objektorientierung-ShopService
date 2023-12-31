package de.ES;

import java.util.List;

public interface OrderRepo {
    void addOrder(Order order);
    void removeOrder(Order order);
    List<Order> getAllOrders();
}