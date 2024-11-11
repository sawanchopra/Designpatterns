package LeetCode.SlidingWindow.Medium;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubStringWithOutRepeatingCharactersPractive {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubString(s));
    }

    private static int longestSubString(String s) {
        int max =0;
        int left =0;
       // int right =0;
        HashSet<Character> seen = new HashSet<>();

      for(int right =0;right<s.length();right++){
          while(seen.contains(s.charAt(right))){
              seen.remove(s.charAt(left));
              left++;
          }
          seen.add(s.charAt(right));
          max = Math.max(max,right-left+1);

      }
      return max;




    }
}






