package LeetCode.SlidingWindow.Medium;

public class longestOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOne(nums, k));
    }

    private static int longestOne(int[] nums, int k) {
   int  i = 0;
   int j =0;
   while (i<nums.length){
       if(nums[i]==0){
           k--;
       }
       if(k<0){
           if(nums[j]==0){
               k++;
           }
           j++;

       }
       i++;
   }
   return i-j;
    }
}
