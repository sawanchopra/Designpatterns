package LeetCode.Stack;

import java.util.Stack;

public class EvaluateRevrsePolination {
    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(tokens));
}

    private static int evalRPN(String[] tokens) {
        Stack <Integer> stack = new Stack<>();
        for(String token:tokens){
            if(token.equals(("+"))){
                stack.push(stack.pop()+stack.pop());
            }
            else if(token.equals(("-"))){
                stack.push(-stack.pop()+stack.pop());

            }
            else if(token.equals(("*"))){
                stack.push(stack.pop()*stack.pop());
            }
            else if(token.equals(("/"))){
                int n1 = stack.pop();
                stack.push(stack.pop()/n1);
            }
            else {
                stack.push(Integer.parseInt(token));
            }

        }
        return stack.peek();

    }
    }
