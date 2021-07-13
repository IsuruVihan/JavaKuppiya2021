package products;

public class Pencil extends Product {

    private int availableQty;
    private final double price;

    public Pencil() {
        availableQty = 120;
        price = 10.00;
    }

    public Pencil(int availableQty, double price) {
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
