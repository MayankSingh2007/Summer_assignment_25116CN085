import java.util.Scanner;

// This program checks whether a matrix is symmetric.
public class Q2 {
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

        if (isSymmetric(matrix)) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }

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

    private static boolean isSymmetric(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}