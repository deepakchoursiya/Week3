package Day02.hashmap.pair_sum;

public class Main{
    public static void main(String[] args) {
        int[] nums = {10, 15, 3, 7};
        int target = 17;

        if (PairSum.hasPairWithSum(nums, target)) {
            System.out.println("Pair exists with the given sum.");
        } else {
            System.out.println("No such pair exists.");
        }
    }
}