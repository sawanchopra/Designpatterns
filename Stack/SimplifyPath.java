package LeetCode.Stack;

import java.util.Arrays;
import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        String path = "/a//b////c/d//././/..";
        System.out.println(simplifyPath(path));
    }

    private static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        for (String s : path.split("/")) {

            if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!s.equals(".") && !s.equals("")) {
                stack.push(s);
            }

        }
        return "/" + String.join("/", stack);


    }
}



