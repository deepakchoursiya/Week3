package stringbuffer.string_concatenation;

public class Main
{

    public static void main(String[] args)
    {
        // Example input
        String[] words = {"Hello", " ", "World", "!", " Welcome", " to", " Java."};

        // Call the function and display the result
        String concatenatedString = ConcatenateString.concatenateStrings(words);
        System.out.println("Concatenated String: " + concatenatedString);
    }
}
