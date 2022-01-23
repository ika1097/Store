package product;

import enumetarion.Size;

import java.time.LocalDate;

public class Clothes extends Product {

    private Size size;
    private String color;

    public Clothes(String name, String brend, double price, Size size, String color) {
        super(name, brend, price);
        this.size = size;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getDiscount() {
        int today = LocalDate.now().getDayOfWeek().getValue();
        return today < 6 ? 0.1 : 1;
    }

    @Override
    public String toString() {
        return this.name + "  " + this.brand + " " + this.size + " " + this.color;
    }
}
