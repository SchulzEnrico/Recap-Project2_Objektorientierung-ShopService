package de.ES;

import java.util.List;

public record Order(
        String orderId,
        String customerName,
        List<Product> products) {

    public List<Product> getProducts() {
    }
}
