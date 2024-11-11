package LeetCode.montonicStack;

import java.util.Stack;

public class dailyTemprature {
    public static void main(String[] args) {
        int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] res = dailyTemperatures(T);
        for (int i : res) {
           // System.out.println(i);
        }
    }

    private static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Check if the current temperature is greater than the temperature
            // at the index stored at the top of the stack
            System.out.println("i: "+i);
            System.out.println(" temp i "+temperatures[i]);
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {

                int idx = stack.pop();
                answer[idx] = i - idx; // Calculate days to wait
            }
            stack.push(i); // Push the current index onto the stack
        }

        return answer;
    }
}
