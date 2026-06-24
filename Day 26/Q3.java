import java.util.Scanner;

// This program simulates a simple ATM system with options to check balance, deposit money, and withdraw money.
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 10000.0;
        int choice;
        double amount;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    amount = sc.nextDouble();
                    balance += amount;
                    System.out.println("Deposit Successful!");
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    amount = sc.nextDouble();

                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Withdrawal Successful!");
                    } else {
                        System.out.println("Insufficient Balance!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}