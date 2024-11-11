package LeetCode.twoPointers.Medium;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 3};
        int k = 6;
        System.out.println(maxOperations(nums, k));

    }

    private static int maxOperations(int[] nums, int k) {
        int count=0;
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
      while (left< right){
          if(nums[left] + nums[right] == k){
              left++;
              right--;
              count++;
          }else if (nums[left] + nums[right] < k){
              left++;
          }else {
              right--;
          }
      }
return count;


    }
}
