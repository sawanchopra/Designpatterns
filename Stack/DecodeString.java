package LeetCode.Stack;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(decodeString(s));
    }

    private static String decodeString(String s) {
        Stack <Integer> countStack = new Stack<>();
        Stack <String> resStack = new Stack<>();
        int i =0;
        StringBuilder result = new StringBuilder();
        while(i<s.length()){

            if(Character.isDigit(s.charAt(i))){
                int count =0;
                while(Character.isDigit(s.charAt(i))){
                    count = count*10 +s.charAt(i) -'0';
                    i++;
                }
                countStack.push(count);
            }
            else if(s.charAt(i) == '[') {
                resStack.push(String.valueOf(result));
                result = new StringBuilder("");
                i++;
            }
            else if(s.charAt(i) == ']'){
                StringBuilder temp = new StringBuilder(resStack.pop());
                int repeatTimes = countStack.pop();
                for(int j=0;j<repeatTimes;j++){
                    temp.append(result);
                }
                result = new StringBuilder(temp.toString());
                i++;
            }
            else{
                result.append(s.charAt(i));
                i++;
            }
        }
        return result.toString();
    }
}
