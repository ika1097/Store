package product;

import java.time.LocalDate;

public class Appliances extends Product {

    private String model;
    private LocalDate productionDate;
    private double weight;

    public Appliances(String name, String brend, double price, String model, LocalDate productionDate, double weight) {
        super(name, brend, price);
        this.model = model;
        this.productionDate = productionDate;
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getDiscount() {
        double discount = 1;
        if (this.price > 999) {
            int today = LocalDate.now().getDayOfWeek().getValue();
            discount = today > 5 ? 0.05 : 1;
        }
        return discount;
    }

    @Override
    public String toString() {
        return this.name + "  " + this.brand + " " + this.model;
    }
}
