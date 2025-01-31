package insertion_sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] employeeIds = {105, 102, 110, 101, 108, 103};

        System.out.println("Original Employee IDs: " + Arrays.toString(employeeIds));

        // Sorting employee IDs using Insertion Sort
        InsertionSort.insertionSort(employeeIds);

        System.out.println("Sorted Employee IDs: " + Arrays.toString(employeeIds));
    }

}
