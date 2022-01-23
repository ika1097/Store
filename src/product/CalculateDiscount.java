package product;

import java.time.LocalDate;

public interface CalculateDiscount {
    default double calculateDiscount(LocalDate expirationDates) {
        double discount = 1;
        LocalDate today = LocalDate.now();
        if ((expirationDates.minusDays(5).compareTo(today) < 0)) {
            discount = 0.1;
        } else if ((expirationDates.compareTo(today) == 0)) {
            discount = 0.5;
        }
        return discount;
    }
}
