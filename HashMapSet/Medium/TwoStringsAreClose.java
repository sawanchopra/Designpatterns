package LeetCode.HashMapSet.Medium;

import java.util.HashMap;

public class TwoStringsAreClose {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "bca";
        System.out.println(areCloseStrings(word1, word2));
    }

    private static boolean areCloseStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        HashMap <Character, Integer> map1 = new HashMap<>();
        HashMap <Character, Integer> map2 = new HashMap<>();
        for(int  i=0;i<word1.length();i++){
            map1.put(word1.charAt(i),map1.getOrDefault(word1.charAt(i),0)+1);
            map2.put(word2.charAt(i),map2.getOrDefault(word2.charAt(i),0)+1);
        }
        if (map1.keySet().equals(map2.keySet())) {
           Integer p1= map1.values().stream().reduce(1, (a, b) -> a * b);
           Integer p2= map2.values().stream().reduce(1, (a, b) -> a * b);

            System.out.println(p1);
            System.out.println(map1.isEmpty());
            System.out.println(p2);

           if(p1.equals(p2) && map1.isEmpty()){
               return true;
           }
        }
        return false;
    }
}
