import java.util.Scanner;

// This program finds the transpose of a matrix.
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input: please enter a valid integer.");
            scanner.close();
            return;
        }
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input: please enter a valid integer.");
            scanner.close();
            return;
        }
        int columns = scanner.nextInt();

        if (rows <= 0 || columns <= 0) {
            System.out.println("Please enter positive matrix dimensions.");
            scanner.close();
            return;
        }

        int[][] matrix = new int[rows][columns];
        int[][] transpose = new int[columns][rows];

        System.out.println("Enter matrix elements:");
        readMatrix(scanner, matrix);

        transposeMatrix(matrix, transpose);

        System.out.println("Transpose matrix:");
        printMatrix(transpose);

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

    private static void transposeMatrix(int[][] matrix, int[][] transpose) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}