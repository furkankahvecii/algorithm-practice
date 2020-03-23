/*
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
	int count = 0;
	int number = 0;
	public int getDecimalValue(ListNode head) {
		if(head == null)
			return 0;
		binaryToDecimal(head);
		return number;
	}
	public  void binaryToDecimal(ListNode head) {
		if(head == null) return ;
		binaryToDecimal(head.next);
		number += head.val * Math.pow(2,count++);
	}
}