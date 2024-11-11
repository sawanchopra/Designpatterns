package LeetCode.BackTracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsToPhonenumber {
    public static void main(String[] args) {
        System.out.println(letterCombinations("")); // Example input
    }

    public static List<String> letterCombinations(String digits) {
        HashMap<Character, String> phoneMap = new HashMap<>();
        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");
        List<String> combinations = new ArrayList<>();
        backtrack(combinations, phoneMap, digits, 0, new StringBuilder());
        return combinations;
    }

    private static void backtrack(List<String> combinations, HashMap<Character, String> phoneMap, String digits, int i, StringBuilder stringBuilder) {
        if(i == digits.length()){
            combinations.add(stringBuilder.toString());

        }
        else{
            char digit  = digits.charAt(i);
            String letters = phoneMap.get(digit);

            for(int j =0;j<letters.length();j++){
                stringBuilder.append(letters.charAt(j));
                backtrack(combinations,phoneMap,digits,i+1,stringBuilder);
                stringBuilder.deleteCharAt(stringBuilder.length()-1);

            }
        }
    }


}
