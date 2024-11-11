package LeetCode.SlidingWindow.Hard;

import java.util.Arrays;

public class MinimumWindowSubString {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }

    private static String minWindow(String s, String t) {
    int arr[] = new int[128];
    for(char ch:t.toCharArray()){
        arr[ch]++;
    }

    int i =0;
    int j =0;
    int start=0;
    int min =Integer.MAX_VALUE;
    int count = t.length();
    while(i<s.length()){
        if(arr[s.charAt(i)]>0){
            count--;
        }
        arr[s.charAt(i)]--;
        System.out.println(Arrays.toString(arr));
        i++;
        while(count ==0){
        if(min > i -j){
           min = i -j;
           start = j;
       }
       if(arr[s.charAt(j)]==0){
           count++;
       }
         arr[s.charAt(j)]++;
            j++;
        }








    }
        return min == Integer.MAX_VALUE ? "" : s.substring(start,start+min);





    }
}
