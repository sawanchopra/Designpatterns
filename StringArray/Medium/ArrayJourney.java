package LeetCode.StringArray.Medium;

public class ArrayJourney {
    public static void main(String[] args) {
        int  [] arr = {1, 6,2, 2, 3, 3, 4, 5, 5, 6, 6};
        int maxStrp = 3;
        System.out.println(arrayJourney(arr, maxStrp));
    }

    private static int arrayJourney(int[] arr, int maxStrp) {
        int n = arr.length;
        int [] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j] || Math.abs(arr[i] - arr[j]) <= maxStrp) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
