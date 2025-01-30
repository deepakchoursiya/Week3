package Day02.hashmap.pair_sum;

import java.util.*;

public class PairSum {
    public static boolean hasPairWithSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>(); // Stores number and its frequency

        for (int num : nums) {
            int complement = target - num; // Find the complement

            // If complement exists in the map, pair exists
            if (numMap.containsKey(complement)) {
                return true;
            }

            // Store the current number in the map
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }

        return false; // No pair found
    }
}

