package binary_search.target_value_2d_matrix;

public class MatrixSearch {

    public static boolean searchMatrix(int[][] matrix, int target) {
        // Edge case: if the matrix is empty
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Initialize left and right pointers
        int left = 0, right = rows * cols - 1;

        // Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Convert the mid index to row and column
            int midRow = mid / cols;
            int midCol = mid % cols;

            // Compare the middle element with the target
            if (matrix[midRow][midCol] == target) {
                return true; // Target found
            } else if (matrix[midRow][midCol] < target) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }

        // Target not found
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 3;
        System.out.println("Target found: " + searchMatrix(matrix, target));

        target = 13;
        System.out.println("Target found: " + searchMatrix(matrix, target));
    }
}
