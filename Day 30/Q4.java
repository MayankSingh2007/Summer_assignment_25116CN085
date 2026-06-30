import java.util.Scanner;

// This program implements a mini student management project with functionalities to add, display, and search student records.
public class Q4 {

    static String[] names = new String[10];
    static int[] rollNos = new int[10];
    static double[] marks = new double[10];
    static int count = 0;

    // Function to add student
    static void addStudent(Scanner sc) {
        if (count < 10) {
            System.out.print("Enter Roll Number: ");
            rollNos[count] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Student Name: ");
            names[count] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[count] = sc.nextDouble();

            count++;
            System.out.println("Student record added successfully!");
        } else {
            System.out.println("Record storage is full!");
        }
    }

    // Function to display students
    static void displayStudents() {
        if (count == 0) {
            System.out.println("No student records found.");
        } else {
            System.out.println("\n===== Student Records =====");
            for (int i = 0; i < count; i++) {
                System.out.println("Roll No : " + rollNos[i]);
                System.out.println("Name    : " + names[i]);
                System.out.println("Marks   : " + marks[i]);
                System.out.println("----------------------");
            }
        }
    }

    // Function to search student
    static void searchStudent(Scanner sc) {
        System.out.print("Enter Roll Number to Search: ");
        int searchRoll = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (rollNos[i] == searchRoll) {
                System.out.println("Student Found!");
                System.out.println("Roll No : " + rollNos[i]);
                System.out.println("Name    : " + names[i]);
                System.out.println("Marks   : " + marks[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Mini Student Management Project =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent(sc);
                    break;

                case 4:
                    System.out.println("Exiting Project...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}