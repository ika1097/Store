package purchase;

import cart.Cart;
import cashier.Cashier;
import product.Appliances;
import product.Beverage;
import product.Clothes;
import product.Food;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static enumetarion.Size.M;

public class Purchase {

    public static void purchaseInitialization(){
        Cashier cashier = new Cashier();

        Food food = new Food("apples", "BrandA", 1.5, LocalDate.parse("2021-06-14"));
        Beverage beverage = new Beverage("milk", "BrandM", 0.99, LocalDate.parse("2022-02-02"));
        Clothes clothes = new Clothes("T-shirt", "BrandT", 15.99, M, "violet");
        Appliances appliances = new Appliances("laptop", "BrandL", 2345, "ModelL", LocalDate.parse("2021-03-03"), 1.125);

        Cart cart = new Cart();
        cart.addProduct(food, 2.45);
        cart.addProduct(beverage, 3.0);
        cart.addProduct(clothes, 2.0);
        cart.addProduct(appliances, 1.0);

        cashier.print(cart, LocalDateTime.now());
    }
}
