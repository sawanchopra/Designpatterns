package LeetCode.BackTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PermutationPractice {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }

    private static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(nums,result,new LinkedList<>());
       return result;
    }

    private static void backTrack(int[] nums, List<List<Integer>> result, LinkedList<Integer> temp) {
        if(temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
        }
        else {
            for(int i =0;i<nums.length;i++){
                if(temp.contains(nums[i])) continue;
                temp.add(nums[i]);
                backTrack(nums,result,temp);
                temp.removeLast();

            }
        }
        }
    }

