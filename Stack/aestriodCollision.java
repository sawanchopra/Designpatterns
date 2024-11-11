package LeetCode.Stack;

import java.util.Arrays;
import java.util.Stack;

public class aestriodCollision {
    public static void main(String[] args) {
        int[] asteroids = { 8, -8};
        int[] result = asteroidCollision(asteroids);
        for (int i : result) {
            System.out.println(i);
        }
    }

    private static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int ast:asteroids){
            Boolean alive =true;
            while(!stack.isEmpty() && ast<0 && stack.peek()>0){
                if(ast < -stack.peek()){
                    stack.pop();
                    continue;
                }
                else if(ast == -stack.peek()){
                    stack.pop();

                }
                alive = false;
                break;

            }
            if(alive){
                stack.push(ast);
            }

        }
        int[] result = new int[stack.size()];
        for(int i = stack.size()-1;i>=0;i--){
            result[i] = stack.pop();
        }
        return result;



    }

}

