package inputstreamreader.read_and_write;

import java.io.*;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        String fileName = "C:\\Sample.txt"; // Specify the file name

        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
             FileWriter fileWriter = new FileWriter(fileName, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            System.out.println("Enter text to write to file (type 'exit' to stop):");
            String line;

            while (!(line = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            System.out.println("User input saved to " + fileName);

        } catch (IOException e) {
            System.err.println("Error handling file: " + e.getMessage());
        }
    }
}
