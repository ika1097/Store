package product;

import java.time.LocalDate;

public class Food extends Product {

    private LocalDate expirationDates;

    public Food(String name, String brend, double price, LocalDate expirationDates) {
        super(name, brend, price);
        this.expirationDates = expirationDates;
    }

    public LocalDate getExpirationDates() {
        return expirationDates;
    }

    public void setExpirationDates(LocalDate expirationDates) {
        this.expirationDates = expirationDates;
    }

    @Override
    public double getDiscount() {
        double discount = 1;
        LocalDate today = LocalDate.now();
        if ((this.expirationDates.minusDays(5).compareTo(today) < 0)) {
            discount = 0.1;
        } else if ((this.expirationDates.compareTo(today) == 0)) {
            discount = 0.5;
        }
        return discount;
    }

    @Override
    public String toString() {
        return this.name + "  " + this.brand;
    }
}
