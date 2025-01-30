package Day02.hashmap.two_sum;

import java.util.*;

public class TwoSum {
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>(); // Stores value and index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Find the complement

            // If complement exists in the map, return indices
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }

            // Store the current number and its index
            numMap.put(nums[i], i);
        }

        return new int[]{-1, -1}; // Return -1 if no solution exists
    }


}
