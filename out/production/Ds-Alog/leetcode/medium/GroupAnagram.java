import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GroupAnagram {
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
        String strs[] = { "cab", "tin", "pew", "duh", "may", "ill", "buy", "bar",
                "max", "doc" };
        // String strs[] = { "a", "a" };
        // String strs[] = { "ddddddddddg", "dgggggggggg" };
        var data = groupAnagrams(strs);
        data.forEach((list) -> {
            System.out.println(list);

        });
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> opList = new HashMap<>();
        for (String string : strs) {

            String key = sortString(string);

            System.out.println(string + " ->  " + key);
            if (opList.containsKey(key)) {
                var list = opList.get(key);
                list.add(string);
                opList.put(key, list);
            } else {
                var list = new ArrayList<String>();
                list.add(string);
                opList.put(key, list);
            }
        }

        List<List<String>> item = new ArrayList<>();

        opList.forEach(
                (key, value) -> {
                    item.add(value);

                });

        return item;
    }

    private static String sortString(String inputString) {

        Character tempArray[] = new Character[inputString.length()];

        for (int i = 0; i < inputString.length(); i++) {
            tempArray[i] = inputString.charAt(i);
        }

        // Sort, ignoring case during sorting
        Arrays.sort(tempArray, new Comparator<Character>() {

            // Method 2
            // To compare characters
            @Override
            public int compare(Character c1, Character c2) {
                // Ignoring case
                return Character.compare(
                        Character.toLowerCase(c1),
                        Character.toLowerCase(c2));
            }
        });

        // Using StringBuilder to convert Character array to
        // String
        StringBuilder sb = new StringBuilder(tempArray.length);

        for (Character c : tempArray)
            sb.append(c.charValue());

        return sb.toString();
    }
}
