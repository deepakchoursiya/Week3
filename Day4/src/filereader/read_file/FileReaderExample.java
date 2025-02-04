package filereader.read_file;

import java.io.*;

public class FileReaderExample  {
    public static void main(String[] args) {
        String fileName = "C:\\Sample.txt"; // Specify the file name

        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // Print each line to the console
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
