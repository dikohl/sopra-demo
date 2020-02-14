/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;

public class PalindromeChecker {

    public boolean checkPalindrome(String original) {
        String reverse = reverseString(original);
        System.out.println(reverse);
        return equalStrings(original, reverse);
    }

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
     * Compare two string if they are the same, if they are empty return false, empty string can't be a palindrome.
     * Disregards anything but letters and numbers as well as the case of the letters.
     * @param original String from user input
     * @param reverse String after reversal
     * @return true if original and reverse are equal and not empty.
     */
    public boolean equalStrings(String original, String reverse) {
        String cleanOriginal = original.replaceAll("[^A-Za-z0-9]","");
        String cleanReverse = reverse.replaceAll("[^A-Za-z0-9]","");

        if (cleanOriginal.isEmpty() || cleanReverse.isEmpty()) {
            return false;
        }

        return cleanOriginal.equalsIgnoreCase(cleanReverse);
    }
}
