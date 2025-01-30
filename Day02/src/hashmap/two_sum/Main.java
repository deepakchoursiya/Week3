package Day02.hashmap.two_sum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSum.findTwoSum(nums, target);

        System.out.println("Indices: " + Arrays.toString(result));
    }
}
