package Day02.hashmap.longest_common_subsequence;

public class Main {
    public static void main(String[] args) {
        int[] array = {100, 4, 200, 1, 3, 2, 101, 102, 5};

        int longestSequenceLength = SequenceFinder.findLongestConsecutiveSequence(array);

        System.out.println("Length of the longest consecutive sequence: " + longestSequenceLength);
    }
}
