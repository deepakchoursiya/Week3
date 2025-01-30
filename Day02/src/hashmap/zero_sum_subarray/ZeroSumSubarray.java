package Day02.hashmap.zero_sum_subarray;

import java.util.*;

public class ZeroSumSubarray {
    public static List<int[]> findZeroSumSubarrays(int[] nums) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        int sum = 0;

        // Initialize map with sum 0 at index -1 to handle cases where subarray starts from index 0
        sumMap.put(0, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; // Compute cumulative sum

            // If sum is found in map, it means there exists a zero-sum subarray
            if (sumMap.containsKey(sum)) {
                for (int startIdx : sumMap.get(sum)) {
                    result.add(new int[]{startIdx + 1, i}); // Store start and end index of subarray
                }
            }

            // Store the current sum with its index
            sumMap.putIfAbsent(sum, new ArrayList<>());
            sumMap.get(sum).add(i);
        }

        return result;
    }


}
