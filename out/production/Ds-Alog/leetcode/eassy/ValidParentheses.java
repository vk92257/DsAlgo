import java.util.Stack;

public class ValidParentheses {

    /*
     * https://leetcode.com/problems/valid-parentheses/submissions/
     * Given a string s containing just the characters '(', ')', '{', '}', '[' and
     * ']', determine if the input string is valid.
     * 
     * An input string is valid if:
     * 
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * 
     * 
     * Example 1:
     * 
     * Input: s = "()"
     * Output: true
     * Example 2:
     * 
     * Input: s = "()[]{}"
     * Output: true
     * Example 3:
     * 
     * Input: s = "(]"
     * Output: false
     * 
     * 
     * Constraints:
     * 
     * 1 <= s.length <= 104
     * s consists of parentheses only '()[]{}'.
     */

    public static void main(String[] args) {
        // String s = "()";
        // String s = "()[]{}";
        // String s = "(]";
        String s = "(])";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        Stack<Character> parentheseStack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == '(') {
                parentheseStack.push(')');
            }
            if (currentChar == ')') {
                if (parentheseStack.size() == 0)
                    return false;
                char temp = parentheseStack.peek();
                if (currentChar == temp) {
                    parentheseStack.pop();
                } else
                    return false;

            }

            if (currentChar == '[') {
                parentheseStack.push(']');
            }

            if (currentChar == ']') {
                if (parentheseStack.size() == 0)
                    return false;
                char temp = parentheseStack.peek();
                if (currentChar == temp) {
                    parentheseStack.pop();
                } else
                    return false;
            }

            if (currentChar == '{') {
                parentheseStack.push('}');
            }

            if (currentChar == '}') {
                if (parentheseStack.size() == 0)
                    return false;
                char temp = parentheseStack.peek();
                if (currentChar == temp) {
                    parentheseStack.pop();
                } else
                    return false;

            }

        }

        if (parentheseStack.size() >= 1)
            return false;
        else
            return true;
    }
}
