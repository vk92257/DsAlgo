import java.util.ArrayList;
import java.util.List;

public class GroupAnagramsTest {

    /*
     * https://leetcode.com/problems/group-anagrams/
     * Given an array of strings strs, group the anagrams together. You can return
     * the answer in any order.
     * 
     * An Anagram is a word or phrase formed by rearranging the letters of a
     * different word or phrase, typically using all the original letters exactly
     * once.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: strs = ["eat","tea","tan","ate","nat","bat"]
     * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
     * Example 2:
     * 
     * Input: strs = [""]
     * Output: [[""]]
     * Example 3:
     * 
     * Input: strs = ["a"]
     * Output: [["a"]]
     * 
     * 
     * Constraints:
     * 
     * 1 <= strs.length <= 104
     * 0 <= strs[i].length <= 100
     * strs[i] consists of lowercase English letters.
     * 
     * 
     * 
     */

    public static void main(String[] args) {
        // String strs[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
        // String strs[] = { "cab", "tin", "pew", "duh", "may", "ill", "buy", "bar",
        // "max", "doc" };
        // String strs[] = { "a", "a" };
        String strs[] = { "ddddddddddg", "dgggggggggg" };
        var data = groupAnagrams(strs);
        System.out.println(" " + data.size());

        for (List<String> list : data) {
            System.out.println(" ");
            for (String item : list) {
                System.out.print(" " + item);
            }
        }
        System.out.println(isMatchString("", ""));

    }

    public static List<List<String>> groupAnagrams(String[] input) {

        ArrayList<Integer> index = new ArrayList<>();
        List<List<String>> list = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            if (!index.contains(i)) {
                var output = new ArrayList<String>();
                String curString = input[i];
                index.add(i);
                output.add(curString);
                for (int m = 0; m < input.length; m++) {
                    if (!index.contains(m)) {

                        String compString = input[m];
                        if (isMatchString(curString, compString)) {
                            index.add(m);
                            output.add(compString);
                        }
                    }

                }
                if (!output.isEmpty())
                    list.add(output);

            }

        }

        return list;
    }
    /*
     * public static List<List<String>> groupAnagrams(String[] input) {
     * 
     * HashMap<Long, ArrayList<String>> output = new HashMap<>();
     * 
     * for (String string : input) {
     * long key = convertWordToInt(string);
     * 
     * System.out.println(key + "  =>>> " + string);
     * if (output.containsKey(key)) {
     * var list = output.get(key);
     * list.add(string);
     * output.put(key, list);
     * } else {
     * ArrayList<String> list = new ArrayList<>();
     * list.add(string);
     * output.put(key, list);
     * }
     * }
     * 
     * List<List<String>> data = new ArrayList<>();
     * for (Entry<Long, ArrayList<String>> entry : output.entrySet()) {
     * data.add(entry.getValue());
     * 
     * }
     * 
     * if (data.isEmpty()) {
     * data.add(new ArrayList<String>());
     * return data;
     * } else
     * return data;
     * 
     * }
     * 
     * public static long convertWordToInt(String word) {
     * long number = 0;
     * for (int i = 0; i < word.length(); i++) {
     * number += word.charAt(i);
     * }
     * return number;
     * }
     */

    private static boolean isMatchString(String curString, String compString) {

        int length = 0;
        boolean isMathch = false;

        if (curString.isEmpty() && compString.isEmpty() || curString.isBlank() && compString.isBlank()) {
            return true;
        }
        for (int j = 0; j < curString.length(); j++) {
            char c = curString.charAt(j);
            for (int k = 0; k < compString.length(); k++) {
                char c1 = compString.charAt(k);
                // System.out.println(c + " ==== " + c1);
                if (c == c1) {
                    // System.out.println(c + " || " + c1);
                    length++;
                    break;
                }

            }

            if (curString.length() == length && compString.length() == length) {
                // System.out.println(curString + " || " + compString);
                isMathch = true;

            }

        }

        return isMathch;
    }

}
