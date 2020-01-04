/*
 * https://leetcode.com/problems/min-stack/
 */

import java.util.Stack;

class MinStack {

   private Stack<Integer> stackArray;
    private Stack<Integer> stackMinArray;
    
    public MinStack() {
        stackArray = new Stack<>();
        stackMinArray = new Stack<>();
    }
    
    public void push(int x) {
    	if(stackMinArray.isEmpty() || x <= stackMinArray.get(stackMinArray.size()-1))
    		stackMinArray.push(x);
    	stackArray.push(x);
    }
    
    public void pop() {
    	if(stackArray.peek().equals(stackMinArray.peek()))
    		stackMinArray.pop();
        stackArray.pop();  
    }
    
    public int top() {
        return stackArray.peek();
    }
    
    public int getMin() {
        return stackMinArray.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */