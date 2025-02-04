package stringbuilder.remove_duplicate_character;

import java.util.HashSet;

public class RemoveDuplicateCharacter {
    public static String removeDuplicateCharacter(String input)
    {
        //crearing a stringbuilder
        StringBuilder sb = new StringBuilder();

        //creating a hashset for storing unique
        HashSet<Character> set = new HashSet<>();

        // looping to length of string if it is unique then only adding to string builder
        for(int i=0;i<input.length();i++)
        {
            if(set.contains(input.charAt(i)) == false)
            {
                set.add(input.charAt(i));
                sb.append(input.charAt(i));
            }
        }

        // return the resultant
        return  sb.toString();
    }
}
