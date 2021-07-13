import products.Pen;
import products.Pencil;
import products.Ruler;

import java.util.Scanner;

public class Shopping {

    private final Pen pen;
    private final Pencil pencil;
    private final Ruler ruler;
    private double total, payment = 0;
    private final int[] cart = {0, 0, 0};

    public Shopping(Pen pen, Pencil pencil, Ruler ruler) {
        this.pen = pen;
        this.pencil = pencil;
        this.ruler = ruler;
    }

    public void printProductDescription() {
        PrintDescription penDescription = new PrintDescription(
                "Pen", pen.getPrice(), pen.getAvailableQty());
        PrintDescription pencilDescription = new PrintDescription(
                "Pencil", pencil.getPrice(), pencil.getAvailableQty());
        PrintDescription rulerDescription = new PrintDescription(
                "Ruler", ruler.getPrice(), ruler.getAvailableQty());

        System.out.println(penDescription);
        System.out.println(pencilDescription);
        System.out.println(rulerDescription);
    }

    public void addToCart(Scanner scn, String product, int availableQty, int cartSlot) {
        while (true) {
            System.out.print("How many " + product + "s do you want to buy?");
            int count = scn.nextInt();
            if (count >= 0) {
                if (count <= availableQty) {
                    int currentQty;
                    cart[cartSlot] = count;
                    switch (cartSlot) {
                        case 0:
                            currentQty = pen.getAvailableQty();
                            pen.setAvailableQty(currentQty - count);
                            break;
                        case 1:
                            currentQty = pencil.getAvailableQty();
                            pencil.setAvailableQty(currentQty - count);
                            break;
                        case 2:
                            currentQty = ruler.getAvailableQty();
                            ruler.setAvailableQty(currentQty - count);
                            break;
                        default:
                            break;
                    }
                    break;
                }
                System.out.println("Quantity exceeded!");
            } else {
                System.out.println("Count should be 0 or 0< !");
            }
        }
    }

    public void printSummary() {
        System.out.println("Pens: " + cart[0] + " => " + (cart[0] * pen.getPrice()));
        System.out.println("Pencils: " + cart[1] + " => " + (cart[1] * pencil.getPrice()));
        System.out.println("Rulers: " + cart[2] + " => " + (cart[2] * ruler.getPrice()));

        this.total = (cart[0] * pen.getPrice()) + (cart[1] * pencil.getPrice()) + (cart[2] * ruler.getPrice());
        System.out.println("Total = " + total);
    }

    public void doPayment(Scanner scn) {
        while (true) {
            System.out.println("Your payment : Rs.");
            this.payment += scn.nextDouble();
            if (this.payment >= this.total) {
                System.out.println("Your balance : Rs." + (this.payment - this.total));
                break;
            }
            System.out.println("Need to pay more " + (this.total - this.payment) + "!");
        }
    }

}
