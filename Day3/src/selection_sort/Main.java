package selection_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] studentScores = {85, 62, 74, 90, 58, 79, 91, 60};

        System.out.println("Original Scores: " + Arrays.toString(studentScores));

        // Sorting student scores using Selection Sort
        SelectionSort.selectionSort(studentScores);

        System.out.println("Sorted Scores: " + Arrays.toString(studentScores));
    }
}
