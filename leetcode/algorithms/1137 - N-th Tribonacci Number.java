/*
 * https://leetcode.com/problems/n-th-tribonacci-number/
 */


import java.util.*;

class Solution 
{
    public int tribonacci(int n) 
    {
        if(n==0)
			return 0;
		if(n==1 || n==2)
			return 1;
        
        Queue<Integer> q = new LinkedList<>(); 
		int threeCount = 0;
		int count = 0;
		
		q.add(0);
		q.add(1);
		q.add(1);
	
		for(int i=q.size();i<=n;i++)
		{
			count=0;
			threeCount = 0;
			
			for(int a : q)
			{
				if((q.size() - 3 ) <= threeCount)
					count+=a;
				
				threeCount++;
			}
			
			q.add(count);
		}
		
		return count;
    }
}