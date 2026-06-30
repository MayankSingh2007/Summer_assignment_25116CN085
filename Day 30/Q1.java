import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] rollNo = new int[n];
        String[] name = new String[n];
        double[] marks = new double[n];

        // Input student records
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Roll Number: ");
            rollNo[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            name[i] = sc.nextLine();

            System.out.print("Marks: ");
            marks[i] = sc.nextDouble();
        }

        // Display records
        System.out.println("\n===== Student Records =====");
        for (int i = 0; i < n; i++) {
            System.out.println("Roll No : " + rollNo[i]);
            System.out.println("Name    : " + name[i]);
            System.out.println("Marks   : " + marks[i]);
            System.out.println("---------------------");
        }

        sc.close();
    }
}