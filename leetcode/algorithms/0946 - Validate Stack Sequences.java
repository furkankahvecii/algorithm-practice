/*
 * https://leetcode.com/problems/validate-stack-sequences/
 */


import java.util.*;

class Solution 
{
	public boolean validateStackSequences(int[] pushed, int[] popped) 
    {
        LinkedList<Integer> q = new LinkedList<>(); 
		int count = 0;
		
		for(int i : pushed)
		{
			q.add(i);	
			
			while(!q.isEmpty() &&  q.getLast() == (popped[count]))
			{
				count++;
				q.remove(q.getLast());
			}
		}

		return q.isEmpty();
    }
}