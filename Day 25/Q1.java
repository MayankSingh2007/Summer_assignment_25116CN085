import java.util.Scanner;

// This program merges two sorted arrays into a single sorted array.
public class Q1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Merge the arrays
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1
        while (i < n1) {
            merged[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2
        while (j < n2) {
            merged[k++] = arr2[j++];
        }

        System.out.print("Merged Array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}