package LeetCode.SlidingWindow.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MaxVowels {
    public static void main(String[] args) {
        String s = "aeiou";
        int k = 2;
        System.out.println(maxVowels(s, k));
    }

    private static int maxVowels(String s, int k) {
        int l=0;
        int count  =0;
        int result  =0;
        List<Character> list = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for(int r =0;r<s.length();r++){
            if(list.contains(s.charAt(r))){
                count++;
            }

            if(r-l+1>k){
                if(list.contains(s.charAt(l))){
                    count--;
                }
                l++;
            }
            result = Math.max(result,count);

        }
        return result;




    }
}
