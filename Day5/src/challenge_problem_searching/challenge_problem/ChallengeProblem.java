package challenge_problem_searching;

import java.util.Arrays;

public class ChallengeProblem {

    // Function to find the first missing positive integer using Linear Search
    public static int findFirstMissingPositive(int[] arr) {
        int n = arr.length;

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // Mark elements out of range or negative elements as n + 1
            if (arr[i] <= 0 || arr[i] > n) {
                arr[i] = n + 1;
            }
        }

        // Mark the elements that are present in the range [1, n] using negative marking
        for (int i = 0; i < n; i++) {
            int num = Math.abs(arr[i]);
            if (num <= n) {
                arr[num - 1] = -Math.abs(arr[num - 1]);
            }
        }

        // Find the first missing positive integer
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                return i + 1;  // The index + 1 is the missing number
            }
        }

        // If no missing positive integer found, return n + 1
        return n + 1;
    }



    // Function to perform Binary Search to find the index of a target
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        // Binary search loop
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found, return the index
            } else if (arr[mid] < target) {
                left = mid + 1; // Target is on the right half
            } else {
                right = mid - 1; // Target is on the left half
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        // Test for Linear Search - Finding the first missing positive integer
        int[] arr1 = {3, 4, -1, 1};
        System.out.println("First missing positive integer: " + findFirstMissingPositive(arr1));

        // Test for Binary Search - Finding the index of a target number
        int[] arr2 = {1, 3, 5, 7, 9, 11};
        int target = 5;
        // Make sure the array is sorted before performing Binary Search
        System.out.println("Index of target " + target + ": " + binarySearch(arr2, target));

        target = 6;
        System.out.println("Index of target " + target + ": " + binarySearch(arr2, target));  // Not found
    }
}
