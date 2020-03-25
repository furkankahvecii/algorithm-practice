/*
 * https://app.codesignal.com/interview-practice/task/HmNvEkfFShPhREMn4
*/

// Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
boolean isListPalindrome(ListNode<Integer> l) {
    ListNode<Integer> l2 = l;
	Stack<Integer> stack = new Stack<>();
	
	while(l2 != null) {
		stack.push(l2.value);
		l2 = l2.next;
	}
	
	while(l != null) {
		int a = stack.pop();
		if(l.value != a) {
			return false;
		}
		l = l.next;
	}
	
	return true;
}


