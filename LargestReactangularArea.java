package LeetCode;

import java.util.Stack;

public class LargestReactangularArea {
    public static void main(String[] args) {
        int hist[] = { 6, 2, 5, 4, 5, 1, 6 };

        // Function call
        System.out.println("Maximum area is "
                + getMaxArea(hist, hist.length));
    }

    private static int getMaxArea(int[] hist, int length) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int i = 0;

        while (i < length) {


          if(stack.isEmpty() || hist[stack.peek()] <= hist[i]) {
            stack.push(i);
            i++;
          } else {
            int top = stack.pop();
            int area = hist[top] * (stack.isEmpty() ? i : i - stack.peek() - 1);
            maxArea = Math.max(maxArea, area);
          }
        }

        return maxArea;
    }
}
