package demo;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringUtil {

    /**
     * Reverses the input string.
     * @param original The original String to be reversed
     * @return The reversed String
     */
    public String reverseString(String original) {
        StringBuilder builder = new StringBuilder();
        builder.append(original);
        return builder.reverse().toString();
    }

    /**
     * Reverses the input string.
     * @param original The original String to be reversed
     * @return The reversed String
     */
    public String reverseStringLong(String original) {
        List<Character> chars = original.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.toList());

        Collections.reverse(chars);

        String reverse = "";
        for (char c : chars) {
            reverse = reverse + c;
        }
        return reverse;
    }

    /**
     * Compare two string if they are the same, if they are empty return false, empty string can't be a palindrome.
     * Disregards anything but letters and numbers as well as the case of the letters.
     * @param original String from user input
     * @param reverse String after reversal
     * @return true if original and reverse are equal and not empty.
     */
    public boolean equalStrings(String original, String reverse) {
        String cleanOriginal = original.replaceAll("[^A-Za-z0-9]",""); //if you use .replace() it won't work!
        String cleanReverse = reverse.replaceAll("[^A-Za-z0-9]","");

        if (cleanOriginal.isEmpty() || cleanReverse.isEmpty()) {
            return false;
        }

        return cleanOriginal.equalsIgnoreCase(cleanReverse);
    }
}
