/*
 * https://leetcode.com/problems/two-sum/
*/


import java.util.Stack;

class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> stack = new Stack();
		stack.add(new StringBuilder(""));
		for(int i = 0 ; i< s.length();i++) {
			
			if(s.charAt(i) == '(') {
				stack.add(new StringBuilder(""));
			}
			else if(s.charAt(i) == ')') {
				StringBuilder str = stack.pop().reverse();
				stack.peek().append(str);
			}
			else {
				stack.peek().append(s.charAt(i));
			}
		}
		
		return stack.peek().toString();
    }
}
