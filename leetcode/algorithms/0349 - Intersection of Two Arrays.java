/*
 * https://leetcode.com/problems/intersection-of-two-arrays/
 */


import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for(int i:nums1)
		{
			if(!map.containsKey(i))
				map.put(i,1);
		}
		
		for(int i:nums2)
		{
			if(map.containsKey(i))
			{
				if(!answer.contains(i))
					answer.add(i);
			}
		}
		
		int[] answerArray = new int[answer.size()];;;;;;
		for(int i=0;i<answer.size();i++)
			answerArray[i] = (int) answer.get(i);
		
		return answerArray;
    }
}