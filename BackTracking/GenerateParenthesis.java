package LeetCode.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }

    private static List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        backTrack(result,"",0,0,n);
     return result;


    }

    private static void backTrack(List<String> result, String s, int i, int i1, int n) {
        if(s.length() == n*2){
            result.add(s);
        }
        if(i<n){
            backTrack(result,s+"(",i+1,i1,n);
        }
        if(i1<i){
            backTrack(result,s+")",i,i1+1,n);
        }
    }

}
