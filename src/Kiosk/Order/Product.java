package Kiosk.Order;

public class Product extends Menu {
    public final double price;

    public Product(String name, double price, String desc) {
        super(name, desc);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
