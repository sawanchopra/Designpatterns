package LeetCode.StringArray.Medium;

import java.util.Arrays;

public class rotateArrayPractive {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    private static void rotate(int[] nums, int i) {
        i = i%nums.length;
        reverse(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
        reverse(nums, 0, i-1);
        reverse(nums, i, nums.length-1);

    }

    private static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

    }
}
