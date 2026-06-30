import java.util.Scanner;
// This program generates a marksheet for a student based on their marks in five subjects.
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Marksheet Generation System =====");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks in Subject 1: ");
        int sub1 = sc.nextInt();

        System.out.print("Enter Marks in Subject 2: ");
        int sub2 = sc.nextInt();

        System.out.print("Enter Marks in Subject 3: ");
        int sub3 = sc.nextInt();

        System.out.print("Enter Marks in Subject 4: ");
        int sub4 = sc.nextInt();

        System.out.print("Enter Marks in Subject 5: ");
        int sub5 = sc.nextInt();

        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        double percentage = total / 5.0;

        String grade;
        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else
            grade = "F";

        System.out.println("\n===== MARKSHEET =====");
        System.out.println("Student Name : " + name);
        System.out.println("Total Marks  : " + total + "/500");
        System.out.println("Percentage   : " + percentage + "%");
        System.out.println("Grade        : " + grade);

        sc.close();
    }
}