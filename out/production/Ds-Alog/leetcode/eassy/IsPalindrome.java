public class IsPalindrome {

    /*
     * https://leetcode.com/problems/palindrome-number/
     * Given an integer x, return true if x is palindrome integer.
     * 
     * An integer is a palindrome when it reads the same backward as forward.
     * 
     * For example, 121 is a palindrome while 123 is not.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: x = 121
     * Output: true
     * Explanation: 121 reads as 121 from left to right and from right to left.
     * Example 2:
     * 
     * Input: x = -121
     * Output: false
     * Explanation: From left to right, it reads -121. From right to left, it
     * becomes 121-. Therefore it is not a palindrome.
     * Example 3:
     * 
     * Input: x = 10
     * Output: false
     * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
     */
    public static void main(String[] args) {
        // int x = 121;
        // int x = -121;

        int x = 12345321;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        String value = String.valueOf(x);
        int startIndex = 0;
        int endIndex = value.length() - 1;
        return isPalindrome(value, startIndex, endIndex);

    }

    public static boolean isPalindrome(String value, int startIndex, int endIndex) {

        if (startIndex >= endIndex) {
            return true;
        }

        if (value.charAt(startIndex) == value.charAt(endIndex)) {
            return isPalindrome(value, startIndex + 1, endIndex - 1);
        } else {
            return false;
        }

    }

}
