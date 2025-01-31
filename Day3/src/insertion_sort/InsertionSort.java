package insertion_sort;

import java.util.Arrays;

public class InsertionSort {
    // Method to perform Insertion Sort
    public static void insertionSort(int[] employeeIds) {
        int n = employeeIds.length;

        for (int i = 1; i < n; i++) {
            int key = employeeIds[i]; // Current element to be inserted
            int j = i - 1;

            // Move elements of the sorted part that are greater than key one position ahead
            while (j >= 0 && employeeIds[j] > key) {
                employeeIds[j + 1] = employeeIds[j];
                j = j - 1;
            }

            // Insert the key at the correct position
            employeeIds[j + 1] = key;
        }
    }


}
