package LeetCode.StringArray.Medium;

import java.util.Arrays;

public class BestTeamWithNoConflicts {
    public static void main(String[] args) {
        int[] scores = {1, 3, 5, 10, 15};
        int[] ages = {1, 2, 3, 4, 5};
        System.out.println(bestTeamScore(scores, ages));
    }

    private static int bestTeamScore(int[] scores, int[] ages) {
        int n = scores.length;
        int[][] players = new int[n][2];
        for (int i = 0; i < n; i++) {
            players[i] = new int[]{ages[i], scores[i]};
        }
        Arrays.sort(players, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = players[i][1];
            for (int j = 0; j < i; j++) {
                if (players[j][1] <= players[i][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + players[i][1]);
                }
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;



    }
}
