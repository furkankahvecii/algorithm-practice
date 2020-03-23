/*
 * https://leetcode.com/problems/remove-linked-list-elements/
 */


class Solution {
	
	public class ListNode {
		int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	
	public ListNode removeElements(ListNode head, int val) 
	{
		if(head == null) return null;
		else {
			if(head.val == val) return removeElements(head.next,val);
			else {
				head.next = removeElements(head.next,val);
				return head;
			}
		}
	}
	
	public ListNode removeElements2(ListNode head, int val) 
	{
		if(head == null) return null;
		ListNode pointer = head;
		
		while(pointer.next != null) {
			if(pointer.next.val == val) {
				pointer.next = pointer.next.next;
			}
			else {
				pointer = pointer.next;
			}
		}
		
		return head.val == val ? head.next : head;
	}
}
