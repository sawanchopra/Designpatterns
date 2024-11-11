package LeetCode.BackTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        List<List<Integer>> result = new java.util.ArrayList<>();
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));
    }


    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new LinkedList<>(), nums);
        return list;
    }

    private static void backtrack(List<List<Integer>> list, LinkedList<Integer> tempList, int[] nums) {
        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
        }
        else{
            for(int i =0;i<nums.length;i++){
                if(tempList.contains(nums[i])) continue;
                tempList.add(nums[i]);
                backtrack(list,tempList,nums);
                tempList.removeLast();


            }

        }



    }
}
