import java.util.Scanner;

// This program subtracts two matrices of the same size.
public class Q2 {
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

        int[][] firstMatrix = new int[rows][columns];
        int[][] secondMatrix = new int[rows][columns];
        int[][] differenceMatrix = new int[rows][columns];

        System.out.println("Enter elements of first matrix:");
        readMatrix(scanner, firstMatrix);

        System.out.println("Enter elements of second matrix:");
        readMatrix(scanner, secondMatrix);

        subtractMatrices(firstMatrix, secondMatrix, differenceMatrix);

        System.out.println("Difference matrix:");
        printMatrix(differenceMatrix);

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

    private static void subtractMatrices(int[][] firstMatrix, int[][] secondMatrix, int[][] differenceMatrix) {
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                differenceMatrix[i][j] = firstMatrix[i][j] - secondMatrix[i][j];
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