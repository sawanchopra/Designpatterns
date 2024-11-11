package LeetCode.StringArray.Easy;

import java.util.Arrays;

public class removeElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElements(nums, val));
    }

    private static int removeElements(int[] nums, int val) {
        int i = 0;
        for(int j = 0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i] = nums[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return i;

    }
}
