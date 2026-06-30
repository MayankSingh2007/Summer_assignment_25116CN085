import java.util.Scanner;

// A simple ticket booking system that allows users to book tickets, check available tickets, and exit the system.
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int availableTickets = 50;
        int choice;

        do {
            System.out.println("\n===== Ticket Booking System =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Check Available Tickets");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of tickets to book: ");
                    int tickets = sc.nextInt();

                    if (tickets <= availableTickets && tickets > 0) {
                        availableTickets -= tickets;
                        System.out.println(tickets + " ticket(s) booked successfully.");
                    } else {
                        System.out.println("Sorry! Not enough tickets available.");
                    }
                    break;

                case 2:
                    System.out.println("Available Tickets: " + availableTickets);
                    break;

                case 3:
                    System.out.println("Exiting Ticket Booking System...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);

        sc.close();
    }
}