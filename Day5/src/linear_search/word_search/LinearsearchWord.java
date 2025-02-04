package linear_search.word_search;

public class LinearsearchWord {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence; // Return the first sentence containing the word
            }
        }
        return "Not Found"; // Return "Not Found" if no sentence contains the word
    }

    public static void main(String[] args) {
        String[] sentences = {
                "The quick brown fox jumps over the lazy dog.",
                "Java programming is fun.",
                "Linear search is a simple algorithm.",
                "Data structures and algorithms are important."
        };
        String word = "search";
        String result = findSentenceWithWord(sentences, word);

        System.out.println("Result: " + result);
    }
}
