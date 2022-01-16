package cart;

import product.Product;

import java.util.HashMap;
import java.util.Map;

public class Cart<T extends Product> {
    private Map<T, Double> products = new HashMap<>();

    public void addProduct(T product, Double quantity) {

        this.products.put(product, quantity);
    }

    public void deleteFromList(Product product) {
        this.products.remove(product);
    }

    public Map<T, Double> getProducts() {
        return this.products;
    }
}