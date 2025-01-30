package Day02.hashmap.longest_common_subsequence;


import java.util.HashSet;
import java.util.Set;

public class SequenceFinder {

    // Finds the length of the longest consecutive elements sequence
    public static int findLongestConsecutiveSequence(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        Set<Integer> numberSet = new HashSet<>();
        for (int num : array) {
            numberSet.add(num);
        }

        int longestStreak = 0;

        for (int num : numberSet) {
            // Check if the current number is the start of a sequence
            if (!numberSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Count consecutive numbers
                while (numberSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
