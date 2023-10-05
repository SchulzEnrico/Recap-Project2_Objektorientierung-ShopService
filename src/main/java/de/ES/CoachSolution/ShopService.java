package de.ES.CoachSolution;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopService {

        private ProductRepo productRepo = new ProductRepo();

        private OrderListRepo orderListRepo = new OrderListRepo();

        public Order addOrder(List<String> productIds) {
            List<Product> products = new ArrayList<>();
            for(String productId : productIds) {
                Product productToOrder = productRepo.getProductById(productId);
                if (productToOrder == null) {
                    System.out.println("Product mit der Id: " + productId + " konnte nicht bestellt werden!");
                    return null;
                }
            }

            Order newOrder = new Order(UUID.randomUUID().toString(), products);

            return orderListRepo.addOrder(newOrder);
    }
}
