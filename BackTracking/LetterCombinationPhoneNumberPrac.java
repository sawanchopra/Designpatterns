package LeetCode.BackTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinationPhoneNumberPrac {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }

    private static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length() == 0){
            return result;
        }
        Map<Character,String> map =
                Map.of('2',"abc",'3',"def",'4',"ghi",'5',"jkl",'6',"mno",'7',"pqrs",'8',"tuv",'9',"wxyz");
        backtrack(result,map,digits,0,new StringBuilder());
        return result;
    }

    private static void backtrack(List<String> result, Map<Character, String> map, String digits, int i, StringBuilder stringBuilder) {
        if(i == digits.length()){
            result.add(stringBuilder.toString());
        }
        else{
            char digit = digits.charAt(i);
            String letters = map.get(digit);
            for(int j =0;j<letters.length();j++){
                stringBuilder.append(letters.charAt(j));
                backtrack(result,map,digits,i+1,stringBuilder);
                stringBuilder.deleteCharAt(stringBuilder.length()-1);

            }
        }

    }
}
