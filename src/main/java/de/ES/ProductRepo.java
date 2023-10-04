package de.ES;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    private List<Product> productList;

    public ProductRepo() {
        productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public List<Product> getAllProducts() {
        return productList;
    }
}
