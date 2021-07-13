import products.Pen;
import products.Pencil;
import products.Ruler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Pen pen = new Pen();
        Pencil pencil = new Pencil();
        Ruler ruler = new Ruler();

        int userAction;
        boolean exitShop = false;
        Scanner scn = new Scanner(System.in);

        while (!exitShop) {
            Shopping shopping = new Shopping(pen, pencil, ruler);
            while (true) {
                System.out.println("1) Go Shopping\n2) Leave\n0) Exit");
                userAction = scn.nextInt();
                if (userAction >= 0 && userAction <= 2) {
                    break;
                }
                System.out.println("Invalid input!");
            }

            switch (userAction) {
                case 1:
                    shopping.printProductDescription();
                    shopping.addToCart(scn, "Pen", pen.getAvailableQty(), 0);
                    shopping.addToCart(scn, "Pencil", pencil.getAvailableQty(), 1);
                    shopping.addToCart(scn, "Ruler", ruler.getAvailableQty(), 2);
                    shopping.printSummary();
                    shopping.doPayment(scn);
                    System.out.println("Next customer please...");
                    break;
                case 2:
                    System.out.println("Next customer please...");
                    break;
                case 0:
                    exitShop = true;
                    break;
                default:
                    break;
            }
        }

        scn.close();

    }

}
