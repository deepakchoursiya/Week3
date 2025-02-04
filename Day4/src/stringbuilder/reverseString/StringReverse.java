package stringbuilder.reverseString;

public class StringReverse {
    public  static String stringReverse(String input)
    {
        //creating a stringbuilder obj and storing the input
        StringBuilder sb = new StringBuilder(input);

        // in low store first index
        int low=0;

        //in high store last index
        int high=input.length()-1;

        //loop until high and low meet
        while(low<high)
        {
            // swapping low and high index character
            char temporary = sb.charAt(low);
            sb.setCharAt(low,sb.charAt(high));
            sb.setCharAt(high,temporary);
            low++;
            high--;

        }

        // return the string
         return sb.toString();

    }
}
