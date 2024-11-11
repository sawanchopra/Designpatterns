package LeetCode.StringArray.Medium;

public class CanJump2 {
    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(canJump2(nums));
    }

    private static int canJump2(int[] nums) {
      int l = 0,r =0;
        int count =0;
        while(r<nums.length-1){
            int max =0;
            for(int i =l;i<=r;i++){
                max = Math.max(max,i+nums[i]);
            }
            l = r+1;
            r = max;
            count++;
        }

        return count;
    }

}


