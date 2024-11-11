package LeetCode.prefixSum;

public class PivtolIndex {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }

    private static int pivotIndex(int[] nums) {
        int sum =0;
        for(int num:nums){
            sum +=num;
        }
        int leftSum=0;
        for(int  i =0;i<nums.length;i++){
            if(leftSum == sum -leftSum-nums[i]){
                return i;

            }
            leftSum+=nums[i];

        }
        return -1;


    }
}
