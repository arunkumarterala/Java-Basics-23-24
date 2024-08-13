package Arrays;

import java.util.Arrays;

public class Singledimensional {

    public static void main(String[] args) {
        // Example of a single-dimensional array
        int[] numbers = { 3, 1, 4, 1, 5, 9 };

        // Print original array
        System.out.println("Original Array:");
        printArray(numbers);

        // Sort the array
        Arrays.sort(numbers);

        // Print sorted array
        System.out.println("\nSorted Array:");
        printArray(numbers);

        // Example of a multi-dimensional array
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Print the matrix
        System.out.println("\nMatrix:");
        printMatrix(matrix);
    }

    // Method to print a single-dimensional array
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Method to print a two-dimensional array (matrix)
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line for the next row
        }
    }
}
