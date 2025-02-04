package stringbuilder.reverseString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {

// taking user input using bufferedreader
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the string to be reversed");

            // Reads input from the user
            String input = br.readLine();
            //display the output
            System.out.println("Reversed string is : "+StringReverse.stringReverse(input));


        } catch (IOException e) {
            e.printStackTrace();
        }

}
}
