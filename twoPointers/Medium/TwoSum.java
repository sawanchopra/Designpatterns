package LeetCode.twoPointers.Medium;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        twoSum(nums, target);
    }

    private static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            if(nums[left]+nums[right] == target){
                return new int[]{left+1, right+1};
            }
            else if(nums[left]+nums[right] < target){
                left++;
            }
            else{
                right--;
            }

        }
        return new int[]{-1, -1};


    }
}
