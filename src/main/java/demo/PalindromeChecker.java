/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromeChecker {

    private final StringUtil stringUtil;

    public PalindromeChecker(StringUtil stringUtil) {
        this.stringUtil = stringUtil;
    }

    public boolean checkPalindrome(String original) {
        String reverse = stringUtil.reverseString(original);
        System.out.println(reverse);
        return stringUtil.equalStrings(original, reverse);  //Ctrl+Alt+N or Option+Command+N to Inline!
    }

}
