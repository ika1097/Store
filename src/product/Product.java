package product;

public abstract class Product {
    protected String name;
    protected String brand;
    protected double price;

    public Product(String name, String brend, double price) {
        this.name = name;
        this.brand = brend;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount(){
        return 1.0;
    }
}
