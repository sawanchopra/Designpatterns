package LeetCode.montonicStack;

import java.util.Stack;

public class dailyTempraturePractice {
    public static void main(String[] args) {
        int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures(T);
        for (int i : result) {
            System.out.println(i);
        }
    }

    private static int[] dailyTemperatures(int[] temprature) {

        int[] result = new int[temprature.length];
        Stack<Integer> stack = new Stack<>();
        for(int i =0;i<temprature.length;i++){
            while(!stack.isEmpty() && temprature[i]>temprature[stack.peek()]){
                int index = stack.pop();
                result[index] = i -index;


            }

            stack.push(i);
        }
        return result;



    }
}
