package stringbuffer.string_concatenation;

public class ConcatenateString {
    public static String concatenateStrings(String[] strings) {
        // Create a new StringBuffer object
        StringBuffer result = new StringBuffer();

        // Iterate through each string in the array and append it to the StringBuffer
        for (String str : strings) {
            result.append(str);
        }

        // Return the concatenated string
        return result.toString();
    }
}