/*
 * https://app.codesignal.com/arcade/intro/level-3/9DgaPsE2a7M6M2Hu6
*/

String reverseInParentheses(String s) {
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
