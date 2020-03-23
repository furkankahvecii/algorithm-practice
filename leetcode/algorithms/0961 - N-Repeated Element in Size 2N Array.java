/*
* https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
*/


import java.util.*;

class Solution 
{
    public int repeatedNTimes(int[] A) 
    {
        Set<Integer> set = new HashSet<Integer>();
	        for(int a : A)
	        {
	        	if(set.contains(a))
	        		return a;
	        	else
	        		set.add(a);
	        }
	        return 0;    
    }
}