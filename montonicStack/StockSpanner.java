package LeetCode.montonicStack;

import java.util.Stack;

public class StockSpanner {
    private Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1; // The span is at least 1 for the current day


        // While the stack is not empty and the price at the top of the stack is less than or equal to the current price
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            System.out.println("stack"+stack.peek()[0]);
            span += stack.pop()[1]; // Add the span of the popped price
        }

        // Push the current price and its span onto the stack
        stack.push(new int[]{price, span});
        return span;
    }
}
