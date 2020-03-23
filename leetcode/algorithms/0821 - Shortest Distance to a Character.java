/*
 * https://leetcode.com/problems/shortest-distance-to-a-character/
 */


import java.util.*;

class Solution 
{
    public int[] shortestToChar(String S, char C) 
    {
        List<Integer> list = new ArrayList<>();
		int[] result = new int[S.length()];

		for(int i=0;i<S.length();i++)
			if(S.charAt(i) == C) list.add(i);
		
		for(int i=0;i<S.length();i++)
		{
			int min=S.length();
			for(int j=0;j<list.size();j++)
			{
				min= Math.min(min, Math.abs(i-list.get(j)));
			}
			result[i]=min;
		}
		return result;
    }
}