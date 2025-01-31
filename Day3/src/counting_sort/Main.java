package counting_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] studentAges = {12, 15, 10, 18, 13, 17, 12, 16, 14, 11, 15};

        System.out.println("Original Student Ages: " + Arrays.toString(studentAges));

        // Sorting using Counting Sort
        CountingSort.countingSort(studentAges, 10, 18);

        System.out.println("Sorted Student Ages: " + Arrays.toString(studentAges));
    }
}
