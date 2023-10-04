package de.ES;

import java.util.ArrayList;
import java.util.List;
public class ShopService {
    private ProductRepo productRepo;
    private OrderListRepo orderListRepo;

    public ShopService(ProductRepo productRepo, OrderListRepo orderListRepo) {
        this.productRepo = productRepo;
        this.orderListRepo = orderListRepo;
    }

    public void placeOrder(Order order) {
        boolean allProductsExist = checkProductsExist(order.getProducts());

        if (allProductsExist) {
            orderListRepo.addOrder(order);
            System.out.println("Order placed successfully.");
        } else {
            System.out.println("Some or all of the ordered products do not exist.");
        }
    }

    private boolean checkProductsExist(List<Product> products) {
        for (Product product : products) {
            if (!productRepo.getAllProducts().contains(product)) {
                return false;
            }
        }
        return true;
    }
}
