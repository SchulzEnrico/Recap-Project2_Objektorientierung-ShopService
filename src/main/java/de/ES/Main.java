package de.ES;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Erstelle ein OrderMapRepo
        OrderMapRepo orderRepo = new OrderMapRepo();
        //OrderListRepo orderRepo = new OrderListRepo();

        ShopService shopService = new ShopService(new ProductRepo(), orderRepo);

        // 6 Produkte hinzufügen (Artikel 6 hat 0 Bestand)
        ProductRepo productRepo = new ProductRepo();
        productRepo.addProduct(new Product("Product1", 0.99, 1));
        productRepo.addProduct(new Product("Product2", 1.99, 1));
        productRepo.addProduct(new Product("Product3", 2.99, 1));
        productRepo.addProduct(new Product("Product4", 3.99, 1));
        productRepo.addProduct(new Product("Product5", 4.99, 1));
        // Produkt mit 0 Bestand hinzufügen
        //productRepo.addProduct(new Product("Product6", 99.99, 0));


        System.out.println("Products: " + '\n' + productRepo.getAllProducts());
        System.out.println("1____________________________________________________________1");

        // Bestellung mit 5 Artikeln (Artikel 6 hat 0 Bestand)
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product1", 0.99, 1));
        products.add(new Product("Product2", 1.99, 1));
        products.add(new Product("Product3", 2.99, 1));
        products.add(new Product("Product4", 3.99, 1));
        products.add(new Product("Product5", 4.99, 1));
        // Produkt mit 0 Bestand bestellen
        //products.add(new Product("Product6", 99.99, 1));

        Order order = new Order("12345", products);
        // Platzieren der Bestellung
        //for each - Methode addProduct
        for (Product product : products) {
            productRepo.addProduct(product);
        }
        shopService.placeOrder(order);


        System.out.println("2____________________________________________________________2");

        // Bestellung anzeigen
        System.out.println("YourOrder: " + '\n' + order);
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("CheckStruggle " + '\n' + orderRepo.getAllOrders());
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

    }
}
