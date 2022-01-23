package product;

import java.time.LocalDate;

public class Food extends Product implements CalculateDiscount{

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
        return calculateDiscount(this.expirationDates);
    }

    @Override
    public String toString() {
        return this.name + "  " + this.brand;
    }
}
