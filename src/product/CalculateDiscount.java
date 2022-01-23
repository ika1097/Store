package product;

import java.time.LocalDate;

public interface CalculateDiscount {
    default double calculateDiscount(LocalDate expirationDates) {
        LocalDate today = LocalDate.now();
        if ((expirationDates.minusDays(5).compareTo(today) < 0)) {
            return 0.1;
        } else if ((expirationDates.compareTo(today) == 0)) {
            return 0.5;
        }
        return 1;
    }
}
