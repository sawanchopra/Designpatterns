package LeetCode.twoPointers.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        threeSum(nums);
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    result.add(list);
                    left++;
                    right--;
                    while(left<right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left<right && nums[right] == nums[right+1]){
                        right--;
                    }

                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }

            }


        }
return result;

    }
}
