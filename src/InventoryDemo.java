import java.util.ArrayList;
import java.util.Collections;

public class InventoryDemo {
    public static void main(String[] args) {
        ArrayList<Product> inventory = new ArrayList<>();
        inventory.add(new Book(((int)(Math.floor(Math.random()*9999))), "Mi djeca s kolodvora Zoo", 12.72, "Christiane F.", "9789533608136"));
        inventory.add(new Book(((int)(Math.floor(Math.random()*9999))), "Kum", 9.6, "Mario Puzo", "9788652147526"));
        inventory.add(new ElectronicItem(((int)(Math.floor(Math.random()*9999))), "DSLR", 599.99, 24));
        inventory.add(new ElectronicItem(((int)(Math.floor(Math.random()*9999))), "Monitor", 189.99, 24));

        for (Product product : inventory) {
            System.out.println(product.getProductInfo());
            System.out.println(product.getDescription());
        }

        Collections.sort(inventory);
        System.out.println("*************************************************");
        System.out.println("Nakon sortiranja");
        System.out.println("*************************************************");
        for (Product product : inventory) {
            System.out.println(product.getProductInfo());
        }

    }
}