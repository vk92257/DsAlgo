import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LongestPalindromicSubstring {

    /*
     * Given a string s, return the longest palindromic substring in s.
     * 
     * https://leetcode.com/problems/longest-palindromic-substring/
     * 
     * Example 1:
     * 
     * Input: s = "babad"
     * Output: "bab"
     * Explanation: "aba" is also a valid answer.
     * Example 2:
     * 
     * Input: s = "cbbd"
     * Output: "bb"
     * 
     * 
     * Constraints:
     * 
     * 1 <= s.length <= 1000
     * s consist of only digits and English letters.
     * 
     */

    public static void main(String[] args) {
        // String s =
        // "ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg";
        // System.out.println(isPalindrome(s, 0, s.length() - 1));

        String s = "bacabab";
        // String s =
        // "321012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210123210012321001232100123210123";
        System.out.println("OUtpu   --->   " + longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {

        int bestLen = 0;
        String bestS = "";
        int n = s.length();

        for (int mid = 0; mid < n; mid++) {
            for (int x = 1; mid - x >= 0 && mid + x < n; x++) {
                if (s.charAt(mid - x) != s.charAt(mid + x)) {
                    break;
                }
                int len = 2 * x + 1;
                if (len > bestLen) {
                    bestLen = len;
                    bestS = s.substring(mid - x, len);
                }
            }
        }

        for (int mid = 0; mid < n - 1; mid++) {
            for (int x = 0; mid - x + 1 >= 0 && mid + x < n; x++) {
                if (s.charAt(mid - x + 1) != s.charAt(mid + x)) {
                    break;
                }
                int len = 2 * x;
            }
        }
        return bestS;
    }

    public static boolean isPalindrome(String s, int start, int end) {

        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return isPalindrome(s, start + 1, end - 1);
    }
}
