package filereader.word_count;

import java.io.*;

public class WordCountInFile {
    public static void main(String[] args) {
        String fileName = "C:\\Sample.txt"; // Specify the file name
        String targetWord = "java"; // Word to count
        int wordCount = 0;

        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                /*
                String[] words = line.split("\\s+"); // Split line into words
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) { // Case-insensitive comparison
                        wordCount++;
                    }
                }

                 */
                if(line.equals(targetWord))
                    wordCount++;
            }

            System.out.println("The word '" + targetWord + "' appears " + wordCount + " times in the file.");

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
