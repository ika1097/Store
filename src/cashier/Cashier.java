package cashier;

import cart.Cart;
import product.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;

public class Cashier {
    public void print(Cart cart, LocalDateTime time) {
        Set<Product> products = cart.getProducts().keySet();
        List<Double> quantity = cart.getProducts().values().stream().toList();
        int counter = 0;
        double subtotal = 0;
        double sumDiscount = 0;

        System.out.printf("Date: %s \n ---Products---\n\n", time.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss")));
        for (Product p : products) {
            double sumPrice = quantity.get(counter) * p.getPrice();
            double discount = sumPrice * p.getDiscount();
            subtotal += sumPrice;
            sumDiscount += discount;

            System.out.println(p);
            System.out.printf("%.2f X $%.2f = $%.2f\n", quantity.get(counter++), p.getPrice(), sumPrice);
            if (p.getDiscount() != 1)
                System.out.printf("#discount %.0f%% -$%.2f\n", p.getDiscount() * 100, discount);
            System.out.println();
        }
        System.out.printf("""
                ------------------------------
                SUBTOTAL: $%.2f
                DISCOUNT: $%.2f

                TOTAL: $%.2f""", subtotal, sumDiscount, subtotal - sumDiscount);
    }
}
