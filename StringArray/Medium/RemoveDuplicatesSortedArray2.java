package LeetCode.StringArray.Medium;


public class RemoveDuplicatesSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println(removeArryDuplicates(nums));
    }

    private static int removeArryDuplicates(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (i < 2 || num > nums[i - 2]) {
                nums[i++] = num;
            }
        }
        return i;
    }
}
