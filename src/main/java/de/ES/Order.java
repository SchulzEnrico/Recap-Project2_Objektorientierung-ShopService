package de.ES;

import java.util.List;

public record Order(
        String orderId,
        List<Product> products) {

    public List<Product> getProducts() {
        return products;
    }

    public String getOrderId() {
        return orderId;
    }
}

