package LeetCode.BackTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        System.out.println(combine(n,k));
    }

    private static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new LinkedList<>();
        combination(1,n,k,new LinkedList<>(),result);
        return result;
    }

    private static void combination(int i, int n, int k, LinkedList<Integer> temp, List<List<Integer>> result) {
    if (k == 0){
        result.add(new ArrayList<>(temp));
        return;

        }
    for(int  j=i;j<=n;j++){
        temp.add(j);
        combination(j+1,n,k-1,temp,result);
        temp.removeLast();

    }
    }
}
