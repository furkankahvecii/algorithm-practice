
/*
 * https://leetcode.com/problems/single-number-iii/
 */

import java.util.*;

class Solution 
{
	public int[] singleNumber(int[] nums) 
	{
		List<Integer> list = new ArrayList<Integer>();
		Object o;
		for (int i : nums) 
		{
			if (!list.contains(i)) 
				list.add(i);
			else 
			{
				o = i;
				list.remove(o);
			}
		}

		int[] numsList = { list.get(0), list.get(1) };

		return numsList;
	}
}
