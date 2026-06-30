import java.util.Scanner;

// This program implements a simple mini library system where users can add, view, and search for books.
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = new String[5];
        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Mini Library System =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (count < books.length) {
                        System.out.print("Enter Book Name: ");
                        books[count] = sc.nextLine();
                        count++;
                        System.out.println("Book added successfully!");
                    } else {
                        System.out.println("Library is full!");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No books available.");
                    } else {
                        System.out.println("\nBooks in Library:");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + books[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book Name to Search: ");
                    String searchBook = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (books[i].equalsIgnoreCase(searchBook)) {
                            System.out.println("Book found at position " + (i + 1));
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Mini Library System...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}