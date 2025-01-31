package bubble_sort;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int[] studentMarks = {85, 62, 74, 90, 58, 79, 91, 60};

        System.out.println("Original Marks: " + Arrays.toString(studentMarks));

        // Sorting student marks using Bubble Sort
        BubbleSort.bubbleSort(studentMarks);

        System.out.println("Sorted Marks: " + Arrays.toString(studentMarks));
    }

}
