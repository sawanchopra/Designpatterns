package LeetCode.Stack;

import java.util.Stack;

public class BasicCaluculatrPractice {
    public static void main(String[] args) {
        String s = "1+1";
        System.out.println(calculate(s));
    }

    private static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int  num=0;
        int result =0;
        int sign =1;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                num = num*10+c-'0';
            }
            else if(c == '+'){
                result += sign*num;
                num =0;
                sign =1;

            }
            else if (c == '-'){
                result += sign*num;
                num =0;
                sign =-1;
            }
           else if(c == '('){
                stack.push(result);
                stack.push(sign);
                result =0;
                sign =1;
            }
            else if(c == ')'){
                result += sign*num;
                num =0;
                result *= stack.pop();
                result += stack.pop();
            }



        }
        if (num != 0) {
            result += sign * num;
        }
        return result;
    }
}
