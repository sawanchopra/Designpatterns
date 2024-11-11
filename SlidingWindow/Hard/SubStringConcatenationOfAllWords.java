package LeetCode.SlidingWindow.Hard;

import java.util.ArrayList;
import java.util.List;

public class SubStringConcatenationOfAllWords{
    public static void main(String[] args) {
        String s = "barfoofoobarthefoobarman";
        String[] words = {"foo", "bar","the"};
        System.out.println(subStringConcatenation(s, words));
    }

    private static List<Integer> subStringConcatenation(String s, String[] words) {
        int wordLength = words[0].length();
        int totalLength = wordLength * words.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length() - totalLength; i++) {
            String subString = s.substring(i, i + totalLength);
            if (isConcatenation(subString, words, wordLength)) {
                list.add(i);
            }
        }
        return list;
    }

    private static boolean isConcatenation(String subString, String[] words, int wordLength) {
        for (int i = 0; i < words.length; i++) {
            String word = subString.substring(i * wordLength, (i + 1) * wordLength);
            if (!isWordPresent(word, words)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isWordPresent(String word, String[] words) {
        for (String s : words) {
            if (s.equals(word)) {
                return true;
            }
        }
        return false;
    }
}
