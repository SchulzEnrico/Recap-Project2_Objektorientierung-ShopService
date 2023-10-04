package de.ES;

public record Product(
        String name,
        double price,
        double quantity) {

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}' + '\n';
    }
}

