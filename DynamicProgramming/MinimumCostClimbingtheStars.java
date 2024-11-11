package LeetCode.DynamicProgramming;

public class MinimumCostClimbingtheStars {
    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        System.out.println(minCostClimbingStairs(cost));
    }

    private static int minCostClimbingStairs(int[] cost) {
        int n =cost.length;
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return cost[0];
        }
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i =2;i<n;i++){
            dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2]);

        }
        return Math.min(dp[n-2],dp[n-1]);
    }
}
