import java.util.ArrayList;
import java.util.Scanner;
// This program implements a simple Inventory Management System using Object-Oriented Programming (OOP) concepts in Java. It allows users to add items, view all items, and search for items by their ID.
class Item {
    int itemId;
    String itemName;
    int quantity;

    Item(int itemId, String itemName, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Item ID   : " + itemId);
        System.out.println("Item Name : " + itemName);
        System.out.println("Quantity  : " + quantity);
        System.out.println("----------------------");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Item> inventory = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== Inventory Management System =====");
            System.out.println("1. Add Item");
            System.out.println("2. View All Items");
            System.out.println("3. Search Item by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Item ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Item Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    inventory.add(new Item(id, name, qty));
                    System.out.println("Item added successfully!");
                    break;

                case 2:
                    if (inventory.isEmpty()) {
                        System.out.println("No items available.");
                    } else {
                        System.out.println("\nInventory Details:");
                        for (Item item : inventory) {
                            item.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Item ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (Item item : inventory) {
                        if (item.itemId == searchId) {
                            item.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Item not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Inventory Management System...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}