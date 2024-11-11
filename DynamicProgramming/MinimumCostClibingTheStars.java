package LeetCode.DynamicProgramming;

import java.util.Arrays;

public class MinimumCostClibingTheStars {
    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(cost));
    }

    private static int minCostClimbingStairs(int[] cost) {
        int  n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i =2;i<n;i++){
            dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2]);
            System.out.println(Arrays.toString(dp));
        }
        return Math.min(dp[n-1],dp[n-2]);
    }
}
