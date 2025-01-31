package merge_sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] bookPrices = {450, 150, 200, 500, 300, 100};

        System.out.println("Original Book Prices: " + Arrays.toString(bookPrices));

        // Sorting book prices using Merge Sort
        MergeSort.mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("Sorted Book Prices: " + Arrays.toString(bookPrices));
    }



}
