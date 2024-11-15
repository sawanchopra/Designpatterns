package LeetCode.StringArray;

public class LeetCode1mergeAlternately {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab","cpde"));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int maxLenghth = Math.max(word1.length(), word2.length());

        for(int i = 0; i < maxLenghth; i++) {
            if(i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if(i < word2.length()) {
                result.append(word2.charAt(i));
            }
        }

        return result.toString();
    }
}
