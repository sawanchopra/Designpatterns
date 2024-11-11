package LeetCode.SlidingWindow.Medium;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }

    private static int minSubArrayLen(int target, int[] nums) {

  int  i =0;
  int j =0;
  int min = Integer.MAX_VALUE;
  int sum =0;
  while(i<nums.length){
      sum += nums[i];
      while(sum >= target ){
          min = Math.min(min,i-j+1);
          sum -= nums[j];
          j++;

      }

      i++;

  }
  return min == Integer.MAX_VALUE ? 0:min;
    }
}
