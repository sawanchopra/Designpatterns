package LeetCode.twoPointers.Easy;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    private static void moveZeroes(int[] nums) {
     int i =0;
     for(int j=0;j<nums.length;j++){
         if(nums[j]!=0){
             nums[i++]=nums[j];
         }
     }
     while (i<nums.length){
         nums[i++]=0;
     }
    }
}
