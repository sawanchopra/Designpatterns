package LeetCode.StringArray;

public class IncreasingTriplet {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(increasingTriplet(nums));
    }

    private static boolean increasingTriplet(int[] nums) {
  int first = Integer.MAX_VALUE;
  int second = Integer.MAX_VALUE;
  for(int num:nums){
      if (first>= num) {
          first = num;
      } else if (second >= num) {
          second = num;
      } else {
          return true;

      }
  }
  return false;
    }
}
