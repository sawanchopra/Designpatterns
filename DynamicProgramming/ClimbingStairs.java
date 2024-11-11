package LeetCode.DynamicProgramming;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

    private static int climbStairs(int i) {
        if(i == 1){
            return 1;
        }
        int[] dp = new int[i+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int j = 3; j<=i; j++){
            dp[j] = dp[j-1] + dp[j-2];
        }
        return dp[i];
    }
}
