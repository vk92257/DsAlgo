public class LongestCommonPrefix {

    /*
     * https://leetcode.com/problems/longest-common-prefix/
     * Write a function to find the longest common prefix string amongst an array of
     * strings.
     * 
     * If there is no common prefix, return an empty string "".
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: strs = ["flower","flow","flight"]
     * Output: "fl"
     * Example 2:
     * 
     * Input: strs = ["dog","racecar","car"]
     * Output: ""
     * Explanation: There is no common prefix among the input strings.
     * 
     * 
     * Constraints:
     * 
     * 1 <= strs.length <= 200
     * 0 <= strs[i].length <= 200
     * strs[i] consists of only lowercase English letters.
     */

    public static void main(String[] args) {
        // String[] strs = { "flower", "flow", "flight" };

        // String[] strs = { "dog", "racecar", "car" };

        // String[] strs = { "geeksforgeeks", "geeks", "geek", "geezer" };

        String[] strs = { "apple", "ape", "april" };

        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {

        var string = strs[0];
        var output = "";

        for (int i = 0; i < string.length(); i++) {

            var prefix = string.charAt(i);

            for (String string2 : strs) {

                if (i < string2.length()) {
                    if (prefix != string2.charAt(i)) {
                        return output;
                    }

                } else {
                    return output;
                }
            }
            output = output.concat(String.valueOf(prefix));

        }

        return output;
    }

    /*
     * public static String longestCommonPrefixRecursion(String[] input, int
     * currentIndex, String str) {
     * 
     * if (currentIndex >= input[0].length()) {
     * return str;
     * }
     * 
     * var each = input[0];
     * var prefix = each.charAt(currentIndex);
     * for (var i = 1; i < input.length; i++) {
     * if (currentIndex >= input[i].length()) {
     * if (input[i].charAt(currentIndex) == prefix) {
     * 
     * } else {
     * return str;
     * }
     * } else {
     * return str;
     * }
     * 
     * }
     * str.concat(String.valueOf(prefix));
     * return longestCommonPrefixRecursion(input, 0, str);
     * }
     */

}
