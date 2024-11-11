package LeetCode.Intervals;

import java.util.ArrayList;
import java.util.List;

public class SummaryOfRanges {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 7};
        System.out.println(summaryRanges(nums));
    }

    private static List<String> summaryRanges(int[] nums) {
   List<String> result = new ArrayList<>();
   for(int  i=0;i<nums.length;i++){
       int start = nums[i];
       while(i+1<nums.length && nums[i+1]-nums[i]==1){
           i++;

       }
       if(start!= nums[i]){
           result.add(start+"->"+nums[i]);

       }else{
           result.add(nums[i]+"");
       }

   }


return result;



    }
}
