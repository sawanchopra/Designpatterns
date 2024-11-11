package LeetCode.HashMapSet.Medium;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedMap;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }

    private static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longestStreak = 0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]-1)){
                continue;
            }
            int currentNum = nums[i];
            int currentStreak = 1;
            while(set.contains(currentNum+1)){
                currentNum++;
                currentStreak++;
            }
            longestStreak = Math.max(longestStreak,currentStreak);

        }


        return longestStreak;


    }
}
