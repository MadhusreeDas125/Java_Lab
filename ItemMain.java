import java.util.Scanner;

class Item {
    int code;
    double price;

    void acceptData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Item Code: ");
        code = sc.nextInt();
        System.out.print("Enter Item Price: ");
        price = sc.nextDouble();
    }

    void display() {
        System.out.printf("%-10d | %-10.2f\n", code, price);
    }
}

public class ItemMain {
    public static void main(String[] args) {
        Item[] items = new Item[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Item " + (i + 1));
            items[i] = new Item();
            items[i].acceptData();
            total += items[i].price;
        }

        System.out.println("\nCode       | Price");
        System.out.println("-----------------------");
        for (Item item : items) {
            item.display();
        }
        System.out.println("-----------------------");
        System.out.println("Total Price: " + total);
    }
}
