import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class GroupAnagrams {

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
        String strs[] = { "cab", "tin", "pew", "duh", "may", "ill", "buy", "bar", "max", "doc" };
        var data = groupAnagrams(strs);

        for (List<String> list : data) {
            System.out.println("  ");
            for (String item : list) {
                System.out.print("  " + item);
            }
        }
        System.out.println(" ");
    }

    public static List<List<String>> groupAnagrams(String[] input) {

        HashMap<Long, ArrayList<String>> output = new HashMap<>();

        for (String string : input) {
            long key = convertWordToInt(string);

            System.out.println(key + "  =>>> " + string);
            if (output.containsKey(key)) {
                var list = output.get(key);
                list.add(string);
                output.put(key, list);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(string);
                output.put(key, list);
            }
        }

        List<List<String>> data = new ArrayList<>();
        for (Entry<Long, ArrayList<String>> entry : output.entrySet()) {
            data.add(entry.getValue());

        }

        if (data.isEmpty()) {
            data.add(new ArrayList<String>());
            return data;
        } else
            return data;

    }

    public static long convertWordToInt(String word) {
        long number = 0;
        for (int i = 0; i < word.length(); i++) {
            number += word.charAt(i);
        }
        return number;
    }

}
