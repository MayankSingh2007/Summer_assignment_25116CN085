import java.util.Scanner;

// This program finds the sum of the diagonals of a square matrix.
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input: please enter a valid integer.");
            scanner.close();
            return;
        }

        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("Please enter a positive matrix size.");
            scanner.close();
            return;
        }

        int[][] matrix = new int[size][size];

        System.out.println("Enter matrix elements:");
        readMatrix(scanner, matrix);

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < size; i++) {
            primaryDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][size - 1 - i];
        }

        int combinedDiagonalSum = primaryDiagonalSum + secondaryDiagonalSum;
        if (size % 2 != 0) {
            combinedDiagonalSum -= matrix[size / 2][size / 2];
        }

        System.out.println("Primary diagonal sum: " + primaryDiagonalSum);
        System.out.println("Secondary diagonal sum: " + secondaryDiagonalSum);
        System.out.println("Combined diagonal sum: " + combinedDiagonalSum);

        scanner.close();
    }

    private static void readMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter element [" + (i + 1) + "][" + (j + 1) + "]: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Invalid input. Enter element [" + (i + 1) + "][" + (j + 1) + "] again: ");
                    scanner.next();
                }
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
}