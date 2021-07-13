package products;

public class Pen extends Product {

    private int availableQty;
    private final double price;

    public Pen() {
        availableQty = 100;
        price = 25.50;
    }

    public Pen(int availableQty, double price) {
        this.availableQty = availableQty;
        this.price = price;
    }

    public int getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(int availableQty) {
        this.availableQty = availableQty;
    }

    public double getPrice() {
        return price;
    }

}
