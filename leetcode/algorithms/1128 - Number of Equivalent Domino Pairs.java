/*
 * https://leetcode.com/problems/number-of-equivalent-domino-pairs/
 */


import java.util.*;

class Solution 
{
	public static int numEquivDominoPairs(int[][] dominoes) 
	{
		Map<String,Integer> set = new HashMap<String,Integer>();
        int count = 0;
        
        for(int a[] : dominoes)
        {
        	Arrays.sort(a);
        	String b = Arrays.toString(a);
        	set.put(b, set.getOrDefault(b,0)+1);      	
        }
        
        for(String s : set.keySet())
        {
        	int n = set.get(s);
        	if(n>1)
        		count += ((n) * (n-1) ) /2; 	
        }
        
        return count;
    }
}