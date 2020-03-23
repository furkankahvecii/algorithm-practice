
/*
 * https://leetcode.com/problems/palindrome-linked-list/
 */


import java.util.LinkedList;
import java.util.Stack;


class Solution {
	
	public class ListNode {
		int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	
	ListNode slow;
	boolean ans;
	
	public boolean isPalindrome(ListNode head) {
	    slow = head;
		isPalin(head);
		return ans;
	} 
	
	public void isPalin(ListNode head) {
		if(head == null) return ;
		isPalin(head.next);
		if(head.val != slow.val) ans = false;
		slow = slow.next;
	}
	
	public boolean isPalindrome2(ListNode head) 
	{
	    ListNode slow = head;
	    Stack<Integer> stack = new Stack<>();
	    while(head != null) {
	 	   stack.add(head.val);
	 	   head = head.next;
	    }
	    while(slow != null) {
	 	   int a = stack.pop();
	 	   if(a != slow.val) return false;
	 	   slow = slow.next;
	    }
	    return true;
	 }  
	
	public boolean isPalindrome3(ListNode head)
	{
		LinkedList<Integer> list = new LinkedList<>();
	    while(head != null) {
	    	list.add(head.val);
	    	head = head.next;
	    }
	    while(list.size() > 1) {
	    	if(list.pollFirst() != list.pollLast())
	    		return false;
	    }
	    
	    return true;   
	}
}
