package Day02.stack_and_queue.sliding_window;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] maxValues = SlidingWindow.maxSlidingWindow(nums, k);

        System.out.println("Sliding Window Maximums: " + Arrays.toString(maxValues));
    }

}
