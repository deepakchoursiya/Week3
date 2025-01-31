package heap_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] salaryDemands = {45000, 60000, 32000, 70000, 50000, 40000, 55000};

        System.out.println("Original Salary Demands: " + Arrays.toString(salaryDemands));

        // Sorting using Heap Sort
        HeapSort.heapSort(salaryDemands);

        System.out.println("Sorted Salary Demands: " + Arrays.toString(salaryDemands));
    }
}
