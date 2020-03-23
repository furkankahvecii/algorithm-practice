/*
 * https://leetcode.com/problems/add-two-numbers/
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
	public static ListNode addTwoNumbersListNode(ListNode l1, ListNode l2)
	 {
		ListNode root = null;
	    ListNode node = null;
	    int rest = 0;

	    do 
	    {            
	    	int value = rest;

	    	if (l1 != null) 
	    	{
	    		value += l1.val;
	    		l1 = l1.next;
	        }
	        if (l2 != null) 
	        {
	        	value += l2.val;
	            l2 = l2.next;
	        }
	            
	        rest = value / 10;
	            
	        if (root == null) 
	        {
	        root = new ListNode(value % 10);
	        node = root;
	        } 
	        else 
	        {
	        node.next = new ListNode(value % 10);
	        node = node.next;
	        }
	            
	    } 
	    while (l1 != null || l2 != null || rest > 0);
	        
	    return root; 
   }	
}
