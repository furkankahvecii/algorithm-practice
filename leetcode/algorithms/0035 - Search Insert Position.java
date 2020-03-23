/*
* https://leetcode.com/problems/search-insert-position/
*/



import java.util.Arrays;

class Solution {
    public int searchInsert(int[] nums, int target) {
        boolean contains = Arrays.stream(nums).anyMatch(x ->  x == target);
		
		if(contains)
		{
			int index = Arrays.binarySearch(nums, target);
			return index;
		}
		else
		{
			for(int i=0 ; i<nums.length;i++)
			{
				if(nums[i]>target)
				{
					return i;
				}
			}
		}
		
		return nums.length;
    }
}