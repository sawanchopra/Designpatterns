package LeetCode;

public class CountingAnagrams {
    public static void main(String[] args) {
        String s = "aa ba dog cat god";
        System.out.println(countAnagrams(s));
    }

    private static int countAnagrams(String s) {
        String[] words = s.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isAnagram(words[i], words[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isAnagram(String word, String word1) {
        if (word.length() != word1.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i) - 'a']++;
            count[word1.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;

    }
}
