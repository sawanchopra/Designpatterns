package LeetCode.StringArray.Easy;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }

    private static int majorityElement(int[] nums) {
     int count =0;
     int candidate = 0;
     for(int num:nums){
         if(count==0){
             System.out.println("if");
             candidate = num;
         }
         System.out.println(candidate);
         count+= (num==candidate)?1:-1;
         System.out.println(count);

     }
     return candidate;
    }
}
