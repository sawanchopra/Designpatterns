package LeetCode.BackTracking;

import java.util.LinkedList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates,target));
    }

    private static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new java.util.ArrayList<>();
        backtrack(result,new LinkedList<>(),candidates,target,0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, LinkedList<Integer> temp, int[] candidates, int target, int i) {
        if(target == 0){
            result.add(new LinkedList<>(temp));
        }
        if(target < 0){
            return;
        }
        for(int j =i;j<candidates.length;j++){
            temp.add(candidates[j]);
            backtrack(result,temp,candidates,target-candidates[j],j);
            temp.removeLast();

        }
    }
}
