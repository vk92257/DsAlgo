
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

        String s = "321012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210123210012321001232100123210123";

        // String s = "racecar";
        // String s =
        // "321012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210123210012321001232100123210123";
        // System.out.println("is Valid palindrome ->>>>" + isPalindrome(s, 0,
        // s.length() - 1));

        System.out.println(Palindrome(s));

    }

    public static String Palindrome(String s) {
        String answer = "";
        int maxLength = 0;
        int n = s.length();
        int[][] dp = new int[n][n];
        // for (int diff = 0; diff < n; diff++) {
        // for (int i = 0, j = i + diff; j < n; i++, i++) {
        // if (i == j) {
        // dp[i][j] = 1;
        // } else if (diff == 1) {
        // dp[i][j] = (s.charAt(i) == s.charAt(j)) ? 2 : 0;
        // } else {
        // if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] != 0) {
        // dp[i][j] = dp[i + 1][j - 1] + 2;
        // }
        // }

        // if (dp[i][j] != 0) {
        // if (j - i + 1 > maxLength) {
        // maxLength = j - i + 1;
        // answer = s.substring(i, maxLength);
        // }
        // }
        // }
        // }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == j) {
                    dp[i][j] = 1;
                } else if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] == 0) {
                    dp[i][j] = dp[i][j] + 2;

                }
                if (dp[i][j] != 0) {
                    if (j - i + 1 > maxLength) {
                        maxLength = j - i + 1;
                        answer = s.substring(i, maxLength);
                    }
                }

            }
        }

        return answer;

    }

    public static String longestPalindrome(String s) {

        int bestLen = 0;
        String bestS = "";
        int n = s.length();

        for (int mid = 0; mid < n; mid++) {
            for (int x = 0; mid - x >= 0 && mid + x < n; x++) {
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
                if (len > bestLen) {
                    bestLen = len;
                    bestS = s.substring(mid - x + 1, len);
                }
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
