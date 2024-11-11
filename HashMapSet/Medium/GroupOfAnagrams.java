package LeetCode.HashMapSet.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupOfAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String sortedString = sortString(str);
            if (map.containsKey(sortedString)) {
                map.get(sortedString).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sortedString, list);
            }
        }
        if(!map.isEmpty()) {
            return new ArrayList<>(map.values());
        }
        return new ArrayList<>();
    }

    private static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);

    }
}
