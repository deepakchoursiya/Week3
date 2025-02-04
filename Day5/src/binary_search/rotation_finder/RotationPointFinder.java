package binary_search.rotation_finder;

public class RotationPointFinder {

    public static int findRotationPoint(int[] arr) {
        // Initialize left and right pointers
        int left = 0, right = arr.length - 1;

        // Perform binary search
        while (left < right) {
            int mid = left + (right - left) / 2;

            // If middle element is greater than the rightmost element,
            // the smallest element is in the right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            }
            // Otherwise, the smallest element is in the left half
            else {
                right = mid;
            }
        }

        // When left equals right, the rotation point (smallest element) is found
        return left; // or arr[left] will give the smallest element
    }

    public static void main(String[] args) {
        int[] arr = { 6, 7, 9, 15, 19, 2, 3 };
        System.out.println("Rotation Point is at index: " + findRotationPoint(arr));
    }
}
