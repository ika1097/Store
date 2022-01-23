package cart;

import product.Product;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Double> products = new HashMap<>();

    public void addProduct(Product product, Double quantity) {

        this.products.put(product, quantity);
    }

    public void deleteFromList(Product product) {
        this.products.remove(product);
    }

    public Map<Product, Double> getProducts() {
        return this.products;
    }
}