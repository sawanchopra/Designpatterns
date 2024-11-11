package LeetCode.StringArray.Medium;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotateArray(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    private static void rotateArray(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }



    private static void reverse(int[] nums, int k, int i) {
        while (k<i) {
          int temp = nums[k];
            nums[k] = nums[i];
            nums[i] = temp;
            k++;
            i--;

        }

}
}
