package binary_search.peak_element;

public class PeakElementFinder {

    public static int findPeakElement(int[] arr) {
        // Initialize left and right pointers
        int left = 0, right = arr.length - 1;

        // Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is a peak element
            if ((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {
                return mid; // Return the index of the peak element
            }

            // If the element on the left is greater than mid, search the left half
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            }
            // If the element on the right is greater than mid, search the right half
            else {
                left = mid + 1;
            }
        }

        return -1; // In case no peak is found (although there should always be one in an array)
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 20, 4, 1, 0 };
        System.out.println("Peak Element is at index: " + findPeakElement(arr));
    }
}
