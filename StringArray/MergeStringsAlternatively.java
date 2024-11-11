package LeetCode.StringArray;

public class MergeStringsAlternatively {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }

    private static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
            int i = 0;
            while(i<word1.length() && i<word2.length()){
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
                i++;
            }
            if(i<word1.length()){
                sb.append(word1.substring(i));
            }
            if(i<word2.length()){
                sb.append(word2.substring(i));
            }

        return sb.toString();

    }
}
