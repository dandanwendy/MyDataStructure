package leetcode.shuaTi.wendyHot100.StackRelated;

import java.util.ArrayList;

public class MinStack {
    /** initialize your data structure here. */
    ArrayList<Integer> stack;
    public MinStack() {
        stack = new ArrayList();
    }

    public void push(int x) {
       stack.add(x);
    }

    public void pop() {
        stack.remove(stack.size()-1);
    }

    public int top() {
         return stack.get(stack.size()-1);
    }

    public int getMin() {
         int min = stack.get(0);
         for(int n:stack){
             if(n<min){
                 min=n;
             }
         }
         return min;
    }
}
