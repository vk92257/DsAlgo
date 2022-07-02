import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    /*
     * 
     * https://leetcode.com/problems/roman-to-integer/
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D
     * and M.
     * 
     * Symbol Value
     * I 1
     * V 5
     * X 10
     * L 50
     * C 100
     * D 500
     * M 1000
     * For example, 2 is written as II in Roman numeral, just two ones added
     * together. 12 is written as XII, which is simply X + II. The number 27 is
     * written as XXVII, which is XX + V + II.
     * 
     * Roman numerals are usually written largest to smallest from left to right.
     * However, the numeral for four is not IIII. Instead, the number four is
     * written as IV. Because the one is before the five we subtract it making four.
     * The same principle applies to the number nine, which is written as IX. There
     * are six instances where subtraction is used:
     * 
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * Given a roman numeral, convert it to an integer.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: s = "III"
     * Output: 3
     * Explanation: III = 3.
     * Example 2:
     * 
     * Input: s = "LVIII"
     * Output: 58
     * Explanation: L = 50, V= 5, III = 3.
     * Example 3:
     * 
     * Input: s = "MCMXCIV"
     * Output: 1994
     * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     * 
     * 
     * Constraints:
     * 
     * 1 <= s.length <= 15
     * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
     * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
     */
    public static void main(String[] args) {
        // String romanNumber = "MCMXCIV";
        // String romanNumber = "LVIII";
        // String romanNumber = "III";
        String romanNumber = "DCXXI";
        System.out.println(romanToInt(romanNumber));

    }

    public static int romanToInt(String s) {
        String I = "I";
        String V = "V";
        String X = "X";
        String L = "L";
        String C = "C";
        String D = "D";
        String M = "M";

        String IV = "IV";
        String IX = "IX";
        String XL = "XL";
        String XC = "XC";
        String CD = "CD";
        String CM = "CM";

        Map<String, Integer> romanValuse = new HashMap<String, Integer>();

        romanValuse.put(I, 1);
        romanValuse.put(X, 10);
        romanValuse.put(C, 100);

        romanValuse.put(V, 5);
        romanValuse.put(L, 50);
        romanValuse.put(D, 500);
        romanValuse.put(M, 1000);

        romanValuse.put(IV, 4);
        romanValuse.put(IX, 9);
        romanValuse.put(XL, 40);
        romanValuse.put(XC, 90);
        romanValuse.put(CD, 400);
        romanValuse.put(CM, 900);

        int number = 0;
        for (var index = 0; index < s.length(); index++) {
            var each = s.charAt(index);

            if (String.valueOf(each).equals(I) && index < s.length() - 1) {

                var eachString = String.valueOf(each).concat(String.valueOf(s.charAt(index + 1)));
                if (eachString.equals(IV)) {
                    number += romanValuse.get(String.valueOf(eachString));
                    index++;
                    continue;
                } else if (eachString.equals(IX)) {
                    number += romanValuse.get(String.valueOf(eachString));
                    index++;
                    continue;
                } else {
                    number += romanValuse.get(String.valueOf(each));
                }

            } else if (String.valueOf(each).equals(X) && index < s.length() - 1) {
                var eachString = String.valueOf(each).concat(String.valueOf(s.charAt(index + 1)));
                if (eachString.equals(XL)) {
                    number += romanValuse.get(String.valueOf(eachString));
                    index++;
                    continue;
                } else if (eachString.equals(XC)) {
                    number += romanValuse.get(String.valueOf(eachString));
                    index++;
                    continue;
                } else {
                    number += romanValuse.get(String.valueOf(each));
                }

            } else if (String.valueOf(each).equals(C) && index < s.length() - 1) {
                var eachString = String.valueOf(each).concat(String.valueOf(s.charAt(index + 1)));
                if (eachString.equals(CD)) {
                    number += romanValuse.get(String.valueOf(eachString));
                    index++;
                    continue;
                } else if (eachString.equals(CM)) {
                    number += romanValuse.get(String.valueOf(eachString));
                    index++;
                    continue;
                } else {
                    number += romanValuse.get(String.valueOf(each));
                }

            } else {
                number += romanValuse.get(String.valueOf(each));
            }

        }

        return number;
    }
}
