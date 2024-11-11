package LeetCode.DynamicProgramming;

import java.util.Arrays;

public class wordBreak {
    public static void main(String[] args) {
        String s = "leetcode";
        String[] wordDict = {"leet","code"};
        System.out.println(wordBreakmethid(s, wordDict));
    }

    private static boolean wordBreakmethid(String s, String[] wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int i = 1; i<=s.length();i++){
            for(int j = 0; j<i;j++){
                if(dp[j] && contains(s.substring(j,i),wordDict)){

                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    private static boolean contains(String substring, String[] wordDict) {
        for(String s: wordDict){
            if(s.equals(substring)){
                return true;
            }
        }
        return false;
    }
}
