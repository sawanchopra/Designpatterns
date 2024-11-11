package LeetCode.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinStack {
    Stack <List<Integer>> stack ;
    int min ;

    public MinStack() {
        stack = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int i) {
        List<Integer> list = new ArrayList<>();
        list.add(i);
        min = Math.min(min,i);
        list.add(min);
        stack.push(list);
    }

    public void pop() {
        if(!stack.isEmpty()){
            stack.pop();
        }
        if(!stack.isEmpty()){
            min = stack.peek().get(1);
        }else{
            min = Integer.MAX_VALUE;
        }
    }

    public int top() {
        if(!stack.isEmpty()){
            return stack.peek().get(0);
        }
        return 0;

    }

    public int getMin() {
        return stack.peek().get(1);
    }
}
