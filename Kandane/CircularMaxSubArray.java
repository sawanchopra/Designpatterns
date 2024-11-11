package LeetCode.Kandane;



public class CircularMaxSubArray {
    public static void main(String[] args) {
        int[] nums = {5,-3,5};
        System.out.println(maxCircularSubArray(nums));
    }

    private static int maxCircularSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        int minSum = nums[0];
        int currentSummin = nums[0];
        int totalSum = nums[0];
        for(int i=1;i<nums.length;i++){
            currentSum = Math.max(nums[i],currentSum+nums[i]);
            maxSum = Math.max(maxSum,currentSum);
            currentSummin = Math.min(nums[i],currentSummin+nums[i]);
            minSum = Math.min(minSum,currentSummin);
            totalSum += nums[i];
        }
        if(maxSum < 0){
            return maxSum;
        }
        return Math.max(maxSum,totalSum-minSum);
    }
}
