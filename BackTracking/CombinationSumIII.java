package LeetCode.BackTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSumIII {
    public static void main(String[] args) {
        int k = 3;
        int n = 7;
        System.out.println(combinationSum3(k,n));
    }

    private static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        combinations(1,k,n,new LinkedList<>(),result);
        return result;
    }

    private static void combinations(int i, int k, int n, LinkedList<Integer> temp, List<List<Integer>> result) {
        if(k == 0 && n ==0){
            result.add(new ArrayList<>(temp));
        }
        if(k == 0 || n == 0){
            return;
        }

        for(int j = i;j<=9;j++){
            temp.add(j);
            combinations(j+1,k-1,n-j,temp,result);
            temp.removeLast();
        }

    }
}
