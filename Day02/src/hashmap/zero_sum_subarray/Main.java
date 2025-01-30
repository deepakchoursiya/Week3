package Day02.hashmap.zero_sum_subarray;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        List<int[]> subarrays = ZeroSumSubarray.findZeroSumSubarrays(nums);

        System.out.println("Zero sum subarrays:");
        for (int[] subarray : subarrays) {
            System.out.println("Start: " + subarray[0] + ", End: " + subarray[1]);
        }
    }
}
