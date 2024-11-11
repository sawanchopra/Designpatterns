package LeetCode.StringArray.Medium;

import java.util.ArrayList;
import java.util.List;

public class findIndexedOFSTRING {
    public static void main(String[] args) {
        String text = "AABATYVHAABAABAA";
        String pattern = "AABA";
        System.out.println(findIndexOfString(text, pattern));
    }

    private static List<Integer> findIndexOfString(String text, String pattern) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        if (text == null || text.length() == 0 || pattern == null || pattern.length() == 0) {
            return result;
        }
        int i = 0;
        int j = 0;
        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
            if (j == pattern.length()) {
                result.add(i - j);
                j = 0;
            }
        }

        return result;
    }

}
