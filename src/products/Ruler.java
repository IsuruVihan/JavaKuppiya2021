package products;

public class Ruler extends Product {

    private int availableQty;
    private final double price;

    public Ruler() {
        availableQty = 80;
        price = 15.75;
    }

    public Ruler(int availableQty, double price) {
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
