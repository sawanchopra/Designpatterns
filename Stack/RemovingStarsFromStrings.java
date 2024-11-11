package LeetCode.Stack;

import java.util.Stack;

public class RemovingStarsFromStrings {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStar(s));
    }

    private static String removeStar(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                if (!stack.isEmpty() ) {
                    stack.pop();
                }
                else {
                    stack.push(c);
                }
            }
            else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();


    }
}
