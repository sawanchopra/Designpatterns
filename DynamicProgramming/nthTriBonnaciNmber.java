package LeetCode.DynamicProgramming;

public class nthTriBonnaciNmber {
    public static void main(String[] args) {
        System.out.println(tribonacci(4));
    }

    private static int tribonacci(int i) {
        if(i == 0){
            return 0;
        }
        if(i == 1 || i == 2){
            return 1;
        }
        int [] dp = new int[i+1];
        for(int j = 2;j<i;j++){
            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 1;
            dp[j+1] = dp[j] + dp[j-1] + dp[j-2];

        }
        return dp[i];
    }
}
