package challenge_Problem_string;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CompareStringAndIo {
    public static void main(String[] args) {
        int iterations = 1_000_000;
        String text = "hello";
        String fileName = "C:\\Sample.txt"; // Specify the file name

        // Compare StringBuilder and StringBuffer
        compareStringConcatenation(iterations, text);

        // Compare FileReader and InputStreamReader
        compareFileReading(fileName);
    }

    private static void compareStringConcatenation(int iterations, String text) {
        long startTime, endTime;

        // StringBuffer Test
        StringBuffer stringBuffer = new StringBuffer();
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }
        endTime = System.nanoTime();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + " ns");

        // StringBuilder Test
        StringBuilder stringBuilder = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }
        endTime = System.nanoTime();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + " ns");
    }

    private static void compareFileReading(String fileName) {
        long startTime, endTime;
        int wordCount = 0;

        // FileReader Test
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            startTime = System.nanoTime();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
            endTime = System.nanoTime();
            System.out.println("FileReader word count: " + wordCount + " | Time taken: " + (endTime - startTime) + " ns");
        } catch (IOException e) {
            System.err.println("Error reading file with FileReader: " + e.getMessage());
        }

        // InputStreamReader Test
        wordCount = 0;
        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            startTime = System.nanoTime();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
            endTime = System.nanoTime();
            System.out.println("InputStreamReader word count: " + wordCount + " | Time taken: " + (endTime - startTime) + " ns");
        } catch (IOException e) {
            System.err.println("Error reading file with InputStreamReader: " + e.getMessage());
        }
    }
}
