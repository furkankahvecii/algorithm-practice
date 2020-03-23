/*
 * https://leetcode.com/problems/contains-duplicate-ii/
 */


import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        Map<Integer,Integer> mapHash = new HashMap<Integer,Integer>();
		
		for(int i=0;i<nums.length;i++)
		{
			if(mapHash.get(nums[i]) ==  null)
				mapHash.put(nums[i], i);
			else if (i - ( mapHash.get(nums[i])) <= k)
			{
				return true;
			}
			else
				mapHash.put(nums[i],i);
		}
		return false;
    }
}