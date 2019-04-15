/*
* https://leetcode.com/problems/merge-two-sorted-lists/
*/



import java.util.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ArrayList<Integer> sorted = new ArrayList <Integer>();
	    while(l1!=null)
	    {
	        	sorted.add(l1.val);
		        l1=l1.next;
	    }
	    while(l2!=null)
	    {
	        	sorted.add(l2.val);
	        	l2=l2.next;
	    }
	    Collections.sort(sorted);
	    ListNode root=null;      		
	    ListNode node=null;	     
	    for(int i=0;i<sorted.size();i++)
	    {
	      if(root == null)
	       {
	    	  root = new ListNode(sorted.get(i));
	    	  node=root;
	       }
	       else 
	       {
	    	   node.next=new ListNode(sorted.get(i));
	    	   node=node.next;
	        }
	     }
	     return root;
    }
}