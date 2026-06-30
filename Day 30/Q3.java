import java.util.Scanner;

// This program implements a mini employee management system.
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] employeeNames = new String[10];
        int[] employeeIds = new int[10];
        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Mini Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (count < employeeNames.length) {
                        System.out.print("Enter Employee ID: ");
                        employeeIds[count] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Employee Name: ");
                        employeeNames[count] = sc.nextLine();

                        count++;
                        System.out.println("Employee added successfully!");
                    } else {
                        System.out.println("Employee storage is full!");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No employee records found.");
                    } else {
                        System.out.println("\nEmployee Records:");
                        for (int i = 0; i < count; i++) {
                            System.out.println("ID: " + employeeIds[i]
                                    + ", Name: " + employeeNames[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (employeeIds[i] == searchId) {
                            System.out.println("Employee Found!");
                            System.out.println("ID: " + employeeIds[i]);
                            System.out.println("Name: " + employeeNames[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Mini Employee Management System...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}