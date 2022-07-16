import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class LongestSubstringNonRepeatChar {

    /*
     * 
     * https://leetcode.com/problems/longest-substring-without-repeating-characters/
     * Given a string s, find the length of the longest substring without repeating
     * characters.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: s = "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     * Example 2:
     * 
     * Input: s = "bbbbb"
     * Output: 1
     * Explanation: The answer is "b", with the length of 1.
     * Example 3:
     * 
     * Input: s = "pwwkew"
     * Output: 3
     * Explanation: The answer is "wke", with the length of 3.
     * Notice that the answer must be a substring, "pwke" is a subsequence and not a
     * substring.
     * 
     * Constraints:
     * 
     * 0 <= s.length <= 5 * 104
     * s consists of English letters, digits, symbols and spaces.
     */

    public static void main(String[] args) {

        // String s = "abcdefg";
        // String s = "abcabcbb";
        // String s = "bbbbb";
        // String s = "pwwkew";
        // String s = "aab";
        String s = "dvdf";

        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        /*
         * Solution steps
         * loop threw every item
         * create a second loop to create substrings
         * lopp till the same char is not found
         * if found the same character add the substring into the list
         * return the size of the longest sub string
         */

        ArrayList<String> outPutList = new ArrayList<>();
        outerLoop: for (int i = 0; i < s.length(); i++) {
            Map<Character, Character> map = new HashMap<>();
            String subString = "";
            for (int j = i; j < s.length(); j++) {
                char currentChar = s.charAt(j);
                if (map.containsKey(currentChar)) {
                    map.remove(currentChar);
                    outPutList.add(subString);
                    break;
                } else {
                    subString += currentChar;
                    map.put(currentChar, currentChar);
                    if (j == s.length() - 1) {
                        outPutList.add(subString);
                        if (subString.length() == s.length()) {
                            break outerLoop;
                        }
                    }
                }

            }
        }

        // finding teh longest substring and returning the size

        int biggestSubStringSize = 0;

        for (String string : outPutList) {
            int currentSubStringSize = string.length();

            System.out.println(string);
            if (currentSubStringSize > biggestSubStringSize) {
                biggestSubStringSize = currentSubStringSize;
            }

        }

        return biggestSubStringSize;
    }

}