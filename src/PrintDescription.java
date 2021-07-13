public class PrintDescription {

    private int availableQty;
    private double price;
    private String product;

    public PrintDescription(String product, double price, int availableQty) {
        this.product = product;
        this.price = price;
        this.availableQty = availableQty;
    }

    public String toString() {
        return product +
                "\n-----\n" +
                "Available  : " +
                availableQty +
                "\nPrice    : " +
                price;
    }

}
