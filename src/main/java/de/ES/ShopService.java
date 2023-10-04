package de.ES;

import java.util.List;

public class ShopService {
    private ProductRepo productRepo;
    private OrderMapRepo orderListRepo;

    public ShopService(ProductRepo productRepo, OrderMapRepo orderListRepo) {
        this.productRepo = productRepo;
        this.orderListRepo = orderListRepo;
    }

    public void placeOrder(Order order) {
        assert order.getProducts() != null;
        boolean allProductsExist;
        allProductsExist = checkProductsExist(order.getProducts());

        if (allProductsExist) {
            orderListRepo.addOrder(order);
            System.out.println("Order placed successfully.");
        } else {
            System.out.println("One, or more of your ordered products are not in stock");
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
